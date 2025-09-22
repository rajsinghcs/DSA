class Solution {
    public int maxFrequencyElements(int[] nums) {
        int arr[] = new int[101];

        for(int i : nums){
            arr[i]++;
        }

        int maxFreq = 0;
        for(int f : arr){
            maxFreq = Math.max(maxFreq, f);
        }
        int ans = 0;
        for(int i: arr){
            if(i==maxFreq){
                ans+=i;
            }
        }
        return ans;
    }
}