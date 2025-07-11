class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int ans =-1;
        int c =1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] <nums[i+1]){
                c++;
            }else{
                ans= Math.max(ans , c);
                c = 1;
            }
        }
        return Math.max(ans,c);
    }
}