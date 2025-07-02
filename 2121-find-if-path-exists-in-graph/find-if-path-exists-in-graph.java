class Solution {
    static boolean ans;

    public static void solve(int src, int dest, List<List<Integer>> adj, boolean[] visited) {
        if (src == dest) {
            ans = true;
            return;
        }

        visited[src] = true;

        for (int neighbor : adj.get(src)) {
            if (!visited[neighbor]) {
                solve(neighbor, dest, adj, visited);
            }
        }
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] cur : edges) {
            int u = cur[0];
            int v = cur[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        ans = false;
        boolean[] visited = new boolean[n];

        solve(source, destination, adj, visited);
        return ans;
    }
}
