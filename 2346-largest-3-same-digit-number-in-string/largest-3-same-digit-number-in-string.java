class Solution {
    public String largestGoodInteger(String num) {
        String[] s = {"999","888","777","666","555","444","333","222","111","000"};
        int x = s.length;
        int c = 0;
        String a = "";

        for (int i = 0; i < x; i++) {
            String currentSubstring = s[i];
            if (num.contains(currentSubstring)) {
                a = currentSubstring;
                c++;
                break;
            }
        }

        if (c > 0) {
            return a;
        }
         else {
            return "";
        }
    }
}