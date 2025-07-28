class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxOr=0;
        for(int i : nums){
            maxOr|=i;
        }
            return sol(0,nums,0,maxOr);
    }
    
    private int sol(int i , int [] nums, int or , int maxOr){
        if(i==nums.length){
            if(or==maxOr){
                return 1;
            }
            else{
                return 0;
            }
        }
        int ans = 0;  
        ans += sol(i + 1, nums, or | nums[i], maxOr);  
        ans += sol(i + 1, nums, or, maxOr);  
        return ans;  
    }  
            
}