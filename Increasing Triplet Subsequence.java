class Solution {
    public boolean increasingTriplet(int[] nums) {
        int low=Integer.MAX_VALUE,mid=Integer.MAX_VALUE;
        for(int j=0;j<nums.length;j++){
            if(nums[j]>mid)
                return true;
            if(nums[j]<low)
                low=nums[j];
            else if(nums[j]>low && nums[j]<mid)
                mid=nums[j];
        }
        return false;
    }
}


// class Solution {
//     public boolean increasingTriplet(int[] nums) {
//         boolean a = false;
//         for(int i =1; i<nums.length-1; i++ ){
//             if( nums[i-1]<nums[i] && nums[i]<nums[i+1]){
//                a = true;
//                break;
//             }
//         }
//         return a;
//     }
// }
