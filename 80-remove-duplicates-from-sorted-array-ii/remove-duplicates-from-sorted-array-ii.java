class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <=2){
            return nums.length ;
        }


        int x = 1 ;
        for(int i = 2 ; i<nums.length ; i++){
        
        if(nums[i] != nums[x-1] ){
            x++;
            nums[x] = nums[i] ;
        }
    }
        return x+1 ;
    }
}