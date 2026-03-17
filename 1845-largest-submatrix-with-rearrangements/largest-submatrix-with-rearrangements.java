class Solution {
    public int largestSubmatrix(int[][] matrix) {
                if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int[] heights = new int[n];
        int maxArea = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    heights[j] += 1;
                } else {
                    heights[j] = 0;
                }
            }

            int[] sortedHeights = Arrays.copyOf(heights, n);
            Arrays.sort(sortedHeights);

            for (int j = 0; j < n; j++) {
                maxArea = Math.max(maxArea, sortedHeights[j] * (n - j));
            }
        }

        return maxArea;
    }
}