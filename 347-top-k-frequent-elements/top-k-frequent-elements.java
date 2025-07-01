class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();  
        for (int num : nums) {  
            map.put(num, map.getOrDefault(num, 0) + 1);  
        }  
       PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> map.get(a) - map.get(b)
        );
       
        for(int i : map.keySet()){
            pq.add(i);
            if(pq.size()>k){
                pq.poll();
            }
        }

        int [] ans = new int[k];
        int i=0;
        while(!pq.isEmpty()){
            ans[i++] = pq.poll();
        }
       return ans;
    }
}