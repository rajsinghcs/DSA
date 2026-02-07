class Solution {
    public int minimumDeletions(String s) {
        Stack<Character> st = new Stack<>();
        int c1 = 0;

        for(char ch : s.toCharArray()){
            if(ch == 'b'){
                st.push(ch);
            }
            else if(ch == 'a' && !st.isEmpty()){
                st.pop();
                c1++;
            }
        }
        return c1;
    }
}