public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String colors1 = "abaca";
        int[][] edges1 = {{0, 1}, {0, 2}, {2, 3}, {3, 4}};
        int output1 = solution.largestPathValue(colors1, edges1);
        System.out.println("Output1: " + output1); // expected output: 3

        String colors2 = "a";
        int[][] edges2 = {{0, 0}};
        int output2 = solution.largestPathValue(colors2, edges2);
        System.out.println("Output2: " + output2); // expected output: -1
    }
}
