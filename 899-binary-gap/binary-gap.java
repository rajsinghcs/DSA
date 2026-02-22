class Solution {
    public int binaryGap(int n) {
        String s = Integer.toBinaryString(n);

        int cnt = 0;
        int o1 = 0;
        int o2 = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                o1 = i;
                o2 = i;
                break;
            }
        }
        for(int i=o1+1; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                o2 = i-o2;
                cnt = Math.max(cnt,o2);
                o2 = i;
            }
        }
        return cnt;
    }
}