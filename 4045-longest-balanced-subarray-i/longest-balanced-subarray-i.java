class Solution {
    public int longestBalanced(int[] nums) {
        int maxLen = 0;
        for(int i=0; i<nums.length; i++){
            Set<Integer> evenSet = new HashSet<>();
            Set<Integer> oddSet = new HashSet<>();

            for(int j=i; j<nums.length; j++){
                int value = nums[j];
                if(value%2==0){
                    evenSet.add(value);
                }else{
                    oddSet.add(value);
                }

                if(evenSet.size() == oddSet.size()){
                    maxLen = Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }
}