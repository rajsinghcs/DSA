class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char i: s.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue <Character> maxHeap = new PriorityQueue <>(
            (a,b) -> map.get(b)-map.get(a)
        );
        maxHeap.addAll(map.keySet());

        StringBuilder ans = new StringBuilder ();
        
        while(!maxHeap.isEmpty()){
            char ch = maxHeap.poll();
            int size = map.get(ch);
            for(int i=0; i<size; i++){
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}