class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int c = -1;
        for (int i : map.keySet()) {
            if (i == map.get(i)) {
                if (i > c) {
                    c = i;
                }
            }
        }
        return c;

    }
}