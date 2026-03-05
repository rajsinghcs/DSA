class Solution {
  public int minOperations(String s) {
    int c = 0;

    for (int i = 0; i < s.length(); i++)
      if (s.charAt(i) - '0' == i % 2)
        c++;

    final int x = s.length() - c; 
    return Math.min(c, x);
  }
}