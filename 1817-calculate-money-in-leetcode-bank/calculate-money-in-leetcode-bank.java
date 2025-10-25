class Solution {
    int totalMoney(int n) {
        
    
        int x = n/7 ;
        int sum = (x*(2*28+(x-1)*7))/2;
        int y = n%7;
        sum+=((y)*(2*(x+1)+(y-1)))/2;

        return sum;
        
    }
}