class Solution {
    public int mySqrt(int x) {

        if(x==1 || x==0){
            return x;
        }

        long start = 1;
        int end = x;
        int result = 0;

        while (start<=end){
            long mid = (start + end)/2;

            if(mid*mid == x ){
                return (int) mid ;
            }

            if(mid*mid< x){
                start = mid+1;
                result = (int) mid;
            }
            else{

                end = (int) mid-1;
            }
        }


        return  (int) result;
        
    }
}