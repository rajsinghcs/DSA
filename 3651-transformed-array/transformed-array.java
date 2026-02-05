class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                arr[i] = 0;
                continue;
            }
            int idx = (i + nums[i]) % len;

            if (idx < 0) {
                idx += len;
            }
            arr[i] = nums[idx];
        }
        return arr;
    }
}