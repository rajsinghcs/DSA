class Solution {
    public int maximum69Number (int num) {
        String s = ""+num;
        String ans = s.replaceFirst("6","9");
        return Integer.parseInt(ans);
    }
}