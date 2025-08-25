class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();

        for(int i: nums){
            set.add(i);
        }
        
        int x = 0;
        for(int i : set){
            nums[x++] = i;
        }

        return set.size();
    }
}
