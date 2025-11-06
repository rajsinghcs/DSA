class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() ==1){
            return s.length();
    }
    int c=0;
    String t = s.trim();
    for(int i=t.length()-1; i>=0; i--){
        if(t.charAt(i) == ' '){
           break;
        }
        else{
            c++;
        }
    }
        return c;
    }
}