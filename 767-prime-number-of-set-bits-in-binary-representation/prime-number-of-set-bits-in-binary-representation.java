class Solution {
    public int countPrimeSetBits(int left, int right) {
        Set<Integer> prime = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17,19));
        int maxCount = 0;
        while(left != right+1){
            String s = Integer.toBinaryString(left);
            int count = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)=='1'){
                    count++;
                }
            }
            if(prime.contains(count)){
                maxCount+=1;
            }
            left++;
        }
        return maxCount;
    }
}