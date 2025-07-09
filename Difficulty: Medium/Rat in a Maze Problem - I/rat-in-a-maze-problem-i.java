
class Solution {
    List<String> ans = new ArrayList<>();
    int n, m;

    public ArrayList<String> ratInMaze(int[][] maze) {
        n = maze.length;
        m = maze[0].length;
        boolean[][] visited = new boolean[n][m];
        StringBuilder s = new StringBuilder();

        if (maze[0][0] == 1) {
            traversal(0, 0, maze, visited, s);
        }

        return new ArrayList<>(ans);
    }

    public void traversal(int row, int col, int[][] maze, boolean[][] visited, StringBuilder s) {
        if (!isValid(row, col, maze, visited)) {
            return;
        }

     
        if (row == n - 1 && col == m - 1) {
            ans.add(s.toString());
            return;
        }

        visited[row][col] = true;

        s.append("D");
        traversal(row + 1, col, maze, visited, s);
        s.deleteCharAt(s.length() - 1);

        s.append("L");
        traversal(row, col - 1, maze, visited, s);
        s.deleteCharAt(s.length() - 1);

        s.append("R");
        traversal(row, col + 1, maze, visited, s);
        s.deleteCharAt(s.length() - 1);
        
        s.append("U");
        traversal(row - 1, col, maze, visited, s);
        s.deleteCharAt(s.length() - 1);

        visited[row][col] = false; 
    }

    public boolean isValid(int row, int col, int[][] maze, boolean[][] visited) {
        return row >= 0 && col >= 0 && row < n && col < m && maze[row][col] == 1 && !visited[row][col];
    }
}
