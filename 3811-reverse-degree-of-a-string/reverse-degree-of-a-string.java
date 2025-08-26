class Solution {
    public int reverseDegree(String s) {
        int idx = 0, deg=0;
        for(int i=0; i<s.length(); i++){
            idx = 'z'- s.charAt(i)+1;
            deg += idx * (1+i) ;
        }
        return deg;
    }
}