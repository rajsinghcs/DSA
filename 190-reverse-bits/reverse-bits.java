class Solution {
    public int reverseBits(int n) {
        String s = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        StringBuilder str = new StringBuilder(s);
        Long x = Long.parseLong(str.reverse().toString(),2);
        return x.intValue();
    }
}