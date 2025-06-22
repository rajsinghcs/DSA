class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1}; 

        int l = 0, r = nums.length - 1;
        while (l <= r && nums[l] != target) {
            l++;
        }
        while (r >= l && nums[r] != target) {
            r--;
        }

        if (l <= r) {
            result[0] = l;
            result[1] = r;
        }

        return result;
    }
}
