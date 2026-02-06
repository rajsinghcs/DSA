class Solution {
    public int minRemoval(int[] nums, int k) {
        if(nums.length == 1){
            return 0;
        }
        Arrays.sort(nums);
        int left = 0;
        int max = 1;

        for(int i=0; i<nums.length; i++){
            if((long)nums[left] * k < nums[i]){
                left++;
            } 

            max = Math.max(max, i-left+1);
        }
        return nums.length-max;
    }
}