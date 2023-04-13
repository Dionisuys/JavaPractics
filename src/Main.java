public class Main {

    public static void main(String[] args) {
        int[] pushed1 = {1, 2, 3, 4, 5};
        int[] popped1 = {4, 5, 3, 2, 1};

        int[] pushed2 = {1, 2, 3, 4, 5};
        int[] popped2 = {4, 3, 5, 1, 2};

        boolean result1 = Solution.validateStackSequences(pushed1, popped1);
        boolean result2 = Solution.validateStackSequences(pushed2, popped2);

        System.out.println(result1); //true
        System.out.println(result2); //false
    }
}
