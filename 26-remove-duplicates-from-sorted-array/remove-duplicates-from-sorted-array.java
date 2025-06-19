class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        int i = 0;
        for (int j : set) {
            nums[i++] = j;
        }

        return set.size();
    }
}
