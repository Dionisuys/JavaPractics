public class Main {
    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1}, stones2 = {1};

        int result = Solution.lastStoneWeight(stones);
        int result2 = Solution.lastStoneWeight(stones2);

        System.out.println(result); //1
        System.out.println(result2); //1
    }
}
