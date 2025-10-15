import java.util.*;

class Solution {
    public int maxIncreasingSubarrays(List<Integer> numsList) {
        int n = numsList.size();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++)
         nums[i] = numsList.get(i);
        
        int ans = 1, cnt = 1, prev = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                cnt++;
            } else {
                prev = cnt;
                cnt = 1;
            }
            ans = Math.max(ans, Math.min(prev, cnt));
            ans = Math.max(ans, cnt / 2);
        }

        return ans;
    }
}
