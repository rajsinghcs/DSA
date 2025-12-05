class Solution {
    public int countPartitions(int[] nums) {
        int sum = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        int leftSum = 0;
        for(int i=0;i<nums.length-1;i++){
            leftSum+=nums[i];
            int rightSum = sum-leftSum;
            if(Math.abs(leftSum-rightSum)%2==0){
                count++;
            }
            
        }
        return count;
        
    }
}