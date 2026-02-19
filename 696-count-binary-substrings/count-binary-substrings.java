class Solution {
    public int countBinarySubstrings(String s) {
        List<Integer> cnt = new ArrayList();
        int freq = 1;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                freq++;
            }else{
                cnt.add(freq);
                freq = 1;
            }
        }
        cnt.add(freq);
        int ans = 0;
        for(int i=1; i<cnt.size(); i++){
            ans += Math.min(cnt.get(i),cnt.get(i-1));
        }

        return ans;
    }
}
