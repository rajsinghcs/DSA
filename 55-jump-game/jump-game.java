class Solution {
    public boolean canJump(int[] nums) {
        int c = 0;
        for(int i=0; i<nums.length; i++){
            if(i<=c){
                c=Math.max(c,i+nums[i]);
            }
        }
        return c>=nums.length-1;
    }
}