class Solution {
    public int findTheWinner(int n, int k) {
       return sol(n, k) +1;
    }

       public int sol(int n , int k){
        if(n<2) return 0;
        return (sol(n-1, k)+ k)%n;
    }
}