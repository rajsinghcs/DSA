class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int c= 0;
        int i=0;
        while(i<nums.length){
            int x = nums[i];
            while(i<nums.length && nums[i]-x <=k){
                i++;
            }
            c++;
        }
        return c;
    }
}