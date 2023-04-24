public class Main {
    public static void main(String[] args) {
        int[][] grid1 = {{1, 0}, {0, 1}},
                grid2 = {{1, 1}, {1, 0}},
                grid3 = {{1, 1}, {1, 1}};

        int result1 = Solution.largestIsland(grid1),
                result2 = Solution.largestIsland(grid2),
                result3 = Solution.largestIsland(grid3);

        System.out.println(result1); //3
        System.out.println(result2); //4
        System.out.println(result3); //4
    }
}
