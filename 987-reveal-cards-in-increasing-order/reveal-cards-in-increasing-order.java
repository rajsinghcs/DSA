class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int [] ans = new int[deck.length];
        Arrays.sort(deck);
        Deque<Integer> dq = new LinkedList<>();

        for(int i=deck.length-1; i>=0; i--){
            if(!dq.isEmpty()){
                dq.addFirst(dq.removeLast());
            }
            dq.addFirst(deck[i]);
        }
        
        int idx= 0;
        for(int i: dq){
            ans[idx++] = i;
        }
        return ans;
    }
}