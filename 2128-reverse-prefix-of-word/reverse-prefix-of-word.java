class Solution {
    public String reversePrefix(String word, char ch) {
        int idx= word.indexOf(ch+"");
        if(idx == -1){
            return word;
        }
        Stack<Character> st = new Stack<>();
        for(int i=idx; i>=0; i--){
            st.push(word.charAt(i));
        }
        for(int i=idx+1; i<word.length(); i++){
            st.push(word.charAt(i));
        }
        StringBuilder s = new StringBuilder();
        for(char c:st){
            s.append(c);
        }
        return s.toString();
    }
}