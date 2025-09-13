class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int v = 0;
        int c=0;
        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(var i:map.entrySet()){
            char key = i.getKey();
            int value = i.getValue();
            if(value>0){
                if(key == 'a' || key == 'e'||key == 'i'||key == 'o'||key == 'u'){
                    c = Math.max(value,c);
                }else{
                    v = Math.max(value,v);
                }
            }
        }
        if((c+v) == 0){
            return 1;
        }
        return c+v;
    }
}