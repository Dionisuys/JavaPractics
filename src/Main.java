/*You are given an m x n binary matrix grid, where 0 represents a sea cell and 1
represents a land cell.

A move consists of walking from one land cell to another adjacent (4-directionally)
land cell or walking off the boundary of the grid.

Return the number of land cells in grid for which we cannot walk off the boundary
of the grid in any number of moves.

Example 1:

Input: grid = [[0,0,0,0],[1,0,1,0],[0,1,1,0],[0,0,0,0]]
Output: 3
Explanation: There are three 1s that are enclosed by 0s, and one 1 that is not
enclosed because its on the boundary.

Example 2:

Input: grid = [[0,1,1,0],[0,0,1,0],[0,0,1,0],[0,0,0,0]]
Output: 0
Explanation: All 1s are either on the boundary or can reach the boundary.
*/
public class Main {

    public static void main(String[] args) {
        int[][] testMatrix1 = {
                {0, 0, 0, 0},
                {1, 0, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0}
        }; // ожидаемый результат: 3

        int[][] testMatrix2 = {
                {0, 1, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 0}
        }; // ожидаемый результат: 0

        int result1 = Solution.numEnclaves(testMatrix1);
        int result2 = Solution.numEnclaves(testMatrix2);

        System.out.println("Результат для тестовой матрицы 1: " + result1);
        System.out.println("Результат для тестовой матрицы 2: " + result2);
    }

}
