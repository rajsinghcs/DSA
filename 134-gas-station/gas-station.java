class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int cur = 0;
        int total = 0;
        int pos = -1;
        for(int i=0; i<gas.length; i++){
            int diff = gas[i] - cost[i];
            cur += diff;
            total += diff;
            if(cur < 0){
                cur = 0;
                pos = i;
            }
        }
        if(total >= 0){
            return pos+1;
        } 
        return -1;
    }
}