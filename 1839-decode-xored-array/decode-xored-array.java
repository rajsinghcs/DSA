class Solution {
    public int[] decode(int[] encoded, int first) {
        int [] ans = new int[encoded.length+1];
        ans[0]=first;
        for(int i=1; i<encoded.length+1; i++){
            ans[i] = encoded[i-1]^first;
            first=ans[i];
        }
        return ans;
    }
}