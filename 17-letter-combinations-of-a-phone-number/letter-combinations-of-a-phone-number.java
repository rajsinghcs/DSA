class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) return new ArrayList<>();
        String[] keys = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        List<String> res = new ArrayList<>();
        res.add("");

        for(char digts : digits.toCharArray()){
            String letter = keys[digts-'0'];
            List<String> temp = new ArrayList<>();

            for (String pfix : res) {
                for (char i : letter.toCharArray()) {
                    temp.add(pfix + i);
                }
            }
            res = temp;
        }
        return res;

    }
}