class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int [] prefix = new int [1002];
        for(int[] curTrips: trips){
            int passenger = curTrips[0];
            int curStart  = curTrips[1];
            int curEnd = curTrips[2];

            prefix[curStart] += passenger;
            prefix[curEnd] -= passenger;
        }
        for(int i=1; i<1002; i++){
            prefix[i] += prefix[i-1];
        }

        for(int i=0; i<prefix.length; i++){
            if(prefix[i]>capacity){
                return false;
            }
        }
        return true;
    }
}