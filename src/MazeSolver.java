import java.util.*;

public class MazeSolver {

    private int[][] m; // stores the maze
    private int n; // number of cells in the maze

    // constructor to initialize the maze
    public MazeSolver(int[][] maze) {
        this.m = maze;
        this.n = maze.length;
    }

    // finds the nearest meeting cell given any two cells
    public int findNearestMeetingCell(int c1, int c2) {
        // check if c1 and c2 are valid cell numbers
        if (c1 < 0 || c1 >= n || c2 < 0 || c2 >= n) {
            throw new IllegalArgumentException("Invalid cell numbers");
        }
        // perform Breadth-First Search from both c1 and c2 simultaneously
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        boolean[] visited1 = new boolean[n];
        boolean[] visited2 = new boolean[n];
        q1.offer(c1);
        q2.offer(c2);
        visited1[c1] = true;
        visited2[c2] = true;
        int meetingCell = -1;
        while (!q1.isEmpty() && !q2.isEmpty()) {
            // explore cells from q1
            int size1 = q1.size();
            for (int i = 0; i < size1; i++) {
                int cell = q1.poll();
                if (visited2[cell]) {
                    meetingCell = cell;
                    break;
                }
                for (int neighbor : getNeighbors(cell)) {
                    if (!visited1[neighbor]) {
                        visited1[neighbor] = true;
                        q1.offer(neighbor);
                    }
                }
            }
            if (meetingCell != -1) {
                break;
            }
            // explore cells from q2
            int size2 = q2.size();
            for (int i = 0; i < size2; i++) {
                int cell = q2.poll();
                if (visited1[cell]) {
                    meetingCell = cell;
                    break;
                }
                for (int neighbor : getNeighbors(cell)) {
                    if (!visited2[neighbor]) {
                        visited2[neighbor] = true;
                        q2.offer(neighbor);
                    }
                }
            }
            if (meetingCell != -1) {
                break;
            }
        }
        return meetingCell;
    }

    // helper method to get neighboring cells of a given cell
    private List<Integer> getNeighbors(int cell) {
        List<Integer> neighbors = new ArrayList<>();
        int row = cell / n;
        int col = cell % n;
        if (row > 0 && m[row-1][col] != -1) {
            neighbors.add((row-1)*n+col);
        }
        if (row < n-1 && m[row+1][col] != -1) {
            neighbors.add((row+1)*n+col);
        }
        if (col > 0 && m[row][col-1] != -1) {
            neighbors.add(row*n+col-1);
        }
        if (col < n-1 && m[row][col+1] != -1) {
            neighbors.add(row*n+col+1);
        }
        return neighbors;
    }
}