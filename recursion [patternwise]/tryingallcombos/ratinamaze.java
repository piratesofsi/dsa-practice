import java.util.ArrayList;

public class ratinamaze {

    // check if next move is safe
    boolean isSafe(int x, int y, int[][] maze, boolean[][] visited, int n) {
        return (x >= 0 && x < n &&
                y >= 0 && y < n &&
                maze[x][y] == 1 &&
                !visited[x][y]);
    }

    // backtracking function
    void solve(int x, int y, int[][] maze,
               ArrayList<String> ans,
               boolean[][] visited,
               StringBuilder path,
               int n) {

        // base case: reached destination
        if (x == n - 1 && y == n - 1) {
            ans.add(path.toString());
            return;
        }

        visited[x][y] = true;

        // Down
        if (isSafe(x + 1, y, maze, visited, n)) {
            path.append("D");
            solve(x + 1, y, maze, ans, visited, path, n);
            path.deleteCharAt(path.length() - 1);
        }

        // Left
        if (isSafe(x, y - 1, maze, visited, n)) {
            path.append("L");
            solve(x, y - 1, maze, ans, visited, path, n);
            path.deleteCharAt(path.length() - 1);
        }

        // Right
        if (isSafe(x, y + 1, maze, visited, n)) {
            path.append("R");
            solve(x, y + 1, maze, ans, visited, path, n);
            path.deleteCharAt(path.length() - 1);
        }

        // Up
        if (isSafe(x - 1, y, maze, visited, n)) {
            path.append("U");
            solve(x - 1, y, maze, ans, visited, path, n);
            path.deleteCharAt(path.length() - 1);
        }

        visited[x][y] = false; // backtrack
    }

    // main function to find paths
    public ArrayList<String> ratInMaze(int[][] maze) {
        int n = maze.length;
        ArrayList<String> ans = new ArrayList<>();

        if (maze[0][0] == 0) return ans;

        boolean[][] visited = new boolean[n][n];
        StringBuilder path = new StringBuilder();

        solve(0, 0, maze, ans, visited, path, n);
        return ans;
    }

    // ---------------- MAIN METHOD (TESTING) ----------------
    public static void main(String[] args) {

        ratinamaze obj = new ratinamaze();

        // predefined example maze
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };

        ArrayList<String> paths = obj.ratInMaze(maze);

        System.out.println("Possible paths:");
        if (paths.size() == 0) {
            System.out.println("No path found");
        } else {
            for (String path : paths) {
                System.out.println(path);
            }
        }
    }
}
