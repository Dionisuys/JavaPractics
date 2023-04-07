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
