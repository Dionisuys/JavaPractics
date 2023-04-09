public class Solution {
    public static int numEnclaves(int[][] grid) {
        int numRows = grid.length; // количество строк в матрице
        int numCols = grid[0].length; // количество столбцов в матрице
        boolean[][] visited = new boolean[numRows][numCols]; /*массив для
        отслеживания посещенных ячеек*/

        // Ищу все связные области и помечаю все ячейки на границе как посещенные
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                /*Если текущая ячейка - земля и находится на границе матрицы,
                 то начинаю поиск связной области*/
                if (grid[i][j] == 1 && (i == 0 || j == 0 || i == numRows - 1 ||
                        j == numCols - 1)) {
                    dfs(grid, i, j, visited); // запуск DFS
                }
            }
        }

        // Считаю количество ячеек, которые не посещены
        int count = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    /*Метод для поиска связных областей с помощью DFS (метод поиска в глубину
    (Depth-First Search))*/
    private static void dfs(int[][] grid, int row, int col, boolean[][] visited) {
        int numRows = grid.length; // количество строк в матрице
        int numCols = grid[0].length; // количество столбцов в матрице

        /*Если достигнуты границы матрицы или текущая ячейка не является землей
        или уже посещена, тогда метод завершается*/
        if (row < 0 || col < 0 || row >= numRows || col >= numCols ||
                grid[row][col] == 0 || visited[row][col]) {
            return;
        }

        visited[row][col] = true; // Пометка текущей ячейки как посещенной

        // Рекурсивно запускаю dfs для всех соседних ячеек
        dfs(grid, row + 1, col, visited);
        dfs(grid, row - 1, col, visited);
        dfs(grid, row, col + 1, visited);
        dfs(grid, row, col - 1, visited);
    }
}
