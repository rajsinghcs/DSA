class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> res = new ArrayList<>();
        int n = s.length();

        for (int i = 0; i < n; i += k) {
            StringBuilder str = new StringBuilder();
            for (int j = i; j < i + k; j++) {
                if (j < n)
                    str.append(s.charAt(j));
                else
                    str.append(fill);
            }
            res.add(str.toString());
        }

        return res.toArray(new String[0]); 
    }
}