class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int i : nums) {
        //     map.put(i, map.getOrDefault(i, 0) + 1);
        // }
        // int n = nums.length/2;
        // for (int i : map.keySet()) {
        //     if (map.get(i) > n) {
        //         return i;
        //     }
        // }
        // return -1;

        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}