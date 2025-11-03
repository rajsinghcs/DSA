class Solution {
  public int minCost(String colors, int[] neededTime) {
    int c = 0;
    int m = neededTime[0];

    for (int i = 1; i < colors.length(); i++)
      if (colors.charAt(i) == colors.charAt(i - 1)) {
        c += Math.min(m, neededTime[i]);
        m = Math.max(m, neededTime[i]);
      }
       else {
        m = neededTime[i];
      }

    return c;
  }
}