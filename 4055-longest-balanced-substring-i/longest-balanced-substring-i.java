class Solution {
    public int longestBalanced(String s) {

        int maxLen = 0;
        for(int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            for(int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch,0)+1);

                if(sameFreq(map)){
                maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
    public boolean sameFreq(HashMap<Character,Integer> map){
        int value = 0;

        for(int i : map.values()) {

            if(value == 0) {
                value = i;
            } else if(value != i) {
                return false;
            }
        }
        return true;
    }
}
