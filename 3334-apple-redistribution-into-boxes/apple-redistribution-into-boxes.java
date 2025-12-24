class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int total_apple = 0;
        for(int i=0; i<apple.length; i++){
            total_apple += apple[i];
        }
        Arrays.sort(capacity);
        int counter = 0;
        int total_capacity = 0;
        for(int i=capacity.length-1; i>=0; i--){
            total_capacity += capacity[i];
            counter++;
            if(total_capacity >= total_apple){
                return counter;
            }
        }
        return 0;
    }
}