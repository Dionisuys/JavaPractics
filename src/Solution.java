import java.util.*;

class Solution {
    private static final int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public static int largestIsland(int[][] grid) {
        int n = grid.length;
        int maxArea = 0;
        int[][] visited = new int[n][n];

        // Рассмотрим каждую клетку сетки
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    // Заменяем 0 на 1 и пересчитываем длину острова
                    grid[i][j] = 1;
                    int currArea = getIslandArea(grid, visited, i, j);
                    maxArea = Math.max(maxArea, currArea);
                    // Возвращаем 0 на место
                    grid[i][j] = 0;
                    visited = new int[n][n];
                }
            }
        }

        // Если все клетки сетки уже были 1, то максимальный остров будет равен n*n
        return maxArea == 0 ? n*n : maxArea;
    }

    private static int getIslandArea(int[][] grid, int[][] visited, int i, int j) {
        int n = grid.length;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {i, j});
        visited[i][j] = 1;
        int area = 1;
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0], y = curr[1];
            for (int[] direction : directions) {
                int dx = x + direction[0], dy = y + direction[1];
                if (dx >= 0 && dx < n && dy >= 0 && dy < n
                        && grid[dx][dy] == 1 && visited[dx][dy] == 0) {
                    queue.offer(new int[] {dx, dy});
                    visited[dx][dy] = 1;
                    area++;
                }
            }
        }
        return area;
    }
}
