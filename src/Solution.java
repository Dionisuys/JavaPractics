class Solution {
    private static int[][] gridM; // сетка островов
    private static int numRows; // количество строк
    private static int numCols; // количество столбцов

    public static int closedIsland(int[][] grid) {
        gridM = grid;
        numRows = grid.length;
        numCols = grid[0].length;

        int count = 0; // количество замкнутых островов

        // проходим по всей сетке островов
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                if (gridM[row][col] == 0 && isClosedIsland(row, col)) { // если
                    // встретили остров и он замкнутый
                    count++; // увеличиваем количество замкнутых островов
                }
            }
        }
        return count;
    }

    // метод для проверки замкнутости острова
    private static boolean isClosedIsland(int row, int col) {
        // проверка на границы массива
        if (row < 0 || col < 0 || row >= numRows || col >= numCols) {
            return false;
        }

        // если клетка содержит воду, то мы можем продолжать
        if (gridM[row][col] == 1) {
            return true;
        }

        // помечаем текущую клетку как посещенную, чтобы не заходить в нее снова
        gridM[row][col] = 1;

        // рекурсивно проверяем соседние клетки
        boolean up = isClosedIsland(row - 1, col);
        boolean down = isClosedIsland(row + 1, col);
        boolean left = isClosedIsland(row, col - 1);
        boolean right = isClosedIsland(row, col + 1);

        // возвращаем true, если все соседние клетки замкнуты
        return up && down && left && right;
    }
}
