class Solution {
    public int smallestNumber(int n) {
        int ans = poweroftwo(n+1);
        return ans-1;
    }
    public int poweroftwo(int n){
        int p = 1;
        while(p<n){
            p*=2;
        }
        return p;
    }
}