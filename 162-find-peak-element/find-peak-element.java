class Solution {
    public int findPeakElement(int[] nums) {

        int x = nums.length;
        int c = 0 ;

        for(int i = 0 ; i<x ; i++){
            
            if(nums[i] > nums[c] ){
                c = i ;
            }
        //     for (int i = 0; i < nums.length - 1; i++) {
        //     if (nums[i] > nums[i + 1]) {
        //         return i;
        //     }
        // }
        // return nums.length - 1;

        }
    return c;
    }
}