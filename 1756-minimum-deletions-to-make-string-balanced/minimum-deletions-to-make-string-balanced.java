// class Solution {
//     public int minimumDeletions(String s) {
//         Stack<Character> st = new Stack<>();
//         int c1 = 0;

//         for(char ch : s.toCharArray()){
//             if(ch == 'b'){
//                 st.push(ch);
//             }
//             else if(ch == 'a' && !st.isEmpty()){
//                 st.pop();
//                 c1++;
//             }
//         }
//         return c1;
//     }
// }


class Solution {
    public int minimumDeletions(String s) {
        int cntB = 0;
        int ans = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'b'){
                cntB++;
            }else{
                if(cntB> 0){
                    cntB--;
                    ans++;
                }
            }
        }
        return ans;
    }
}