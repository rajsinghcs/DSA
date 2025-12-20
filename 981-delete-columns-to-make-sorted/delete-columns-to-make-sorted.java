class Solution {
    public int minDeletionSize(String[] s) {
        int n = s.length, m = s[0].length();
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int row = 1; row < n; row++) {
                if (s[row].charAt(i) < s[row - 1].charAt(i)) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}