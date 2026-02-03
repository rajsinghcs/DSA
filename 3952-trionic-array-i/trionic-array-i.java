class Solution {
    public boolean isTrionic(int[] nums) {
        int counter = 0;
        if(nums.length < 4 || nums[0] > nums[1]) return false;

        for(int i=0; i<nums.length-1; i++){
            if(counter == 0){
                if(nums[i] < nums[i+1] ){
                    counter = 0;
                }else if(nums[i] > nums[i+1]){
                    counter = 1;
                }else{
                    return false;
                }
            }else if(counter == 1){
                if(nums[i] > nums[i+1]){
                    counter = 1;
                }else if(nums[i] < nums[i+1]){
                    counter=2;
                }else{
                    return false;
                }
            }else if(counter == 2){
                if(nums[i] > nums[i+1] || nums[i] == nums[i+1]){
                    return false;
                }
            }
        }
        return counter == 2;
    }
}