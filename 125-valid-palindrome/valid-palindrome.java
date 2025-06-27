// class Solution {
//     public boolean isPalindrome(String s) {
//         s = s.toLowerCase();
//         String delims = "\\W+";
//         String[] words = s.trim().split(delims);

//         StringBuilder sb = new StringBuilder(String.join("", words));
//         String st = sb.toString();
//         String str = sb.reverse().toString();

//         return str.equals(st);
//     }
// }



class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");  
        StringBuilder sb = new StringBuilder(s);
        String st = sb.toString();
        String str = sb.reverse().toString();
        return str.equals(st);
    }
}
