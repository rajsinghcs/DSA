class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if (map.containsKey(cs)) {
                if (map.get(cs) != ct) return false;
            } else {
                if (set.contains(ct)) return false; 
                map.put(cs, ct);
                set.add(ct);
            }
        }
        return true;
    }
}
