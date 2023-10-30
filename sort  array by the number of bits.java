class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] arrints = new Integer[arr.length];

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            arrints[i] = arr[i];
            if(map.containsKey(arr[i])) continue;
            map.put(arr[i], bitCounts(arr[i]));
        }

        Arrays.sort(arrints,(Integer a, Integer b)->{
            int ac = map.get(a);
            int bc = map.get(b);
            if(ac==bc) return a - b;
            return ac-bc;
        });

        for(int i = 0; i < arr.length; i++) arr[i] = arrints[i];

        return arr;
    }

    int bitCounts(int num){
        int count = 0;
        while(0 < num){
            if((num & 1) == 1) count++;
            num = num >> 1;
        }
        return count;
    }
}
