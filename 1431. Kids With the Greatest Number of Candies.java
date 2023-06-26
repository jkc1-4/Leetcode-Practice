class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max =0;
        for(int candy : candies){
            max = Math.max(candy, max);
        }

        List<Boolean> result = new ArrayList<>(candies.length);

        for(int i =0; i< candies.length ; i++){
            int candys = candies[i] + extraCandies;
            if(candys>=max){
                result.add(true);
            }else{
                result.add(false);
            }
            
       }
        return result;
    }
}
