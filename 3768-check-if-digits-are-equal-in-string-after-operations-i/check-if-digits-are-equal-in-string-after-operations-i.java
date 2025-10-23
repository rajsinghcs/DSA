class Solution {
    public boolean hasSameDigits(String s) {
        
        while(s.length() > 2){
            StringBuilder st = new StringBuilder();
            for (int i = 0; i < s.length() - 1; i++) {  
                int fDigit = s.charAt(i) - '0'; 
                int sDigit = s.charAt(i + 1) - '0'; 
                int newDigit = (fDigit + sDigit) % 10 ; 
                st.append(newDigit); 
            }  
             s = st.toString(); 
        }
        return s.charAt(0) == s.charAt(1);
    }
}