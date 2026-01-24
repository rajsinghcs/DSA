class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length-1;
        int maxSum = Integer.MIN_VALUE;

        while(left < right){
            maxSum = Math.max(maxSum, nums[left]+nums[right]);
            left++;
            right--;
        }
        return maxSum;
    }
}