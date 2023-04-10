public class Main {
    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";

        boolean result1 = Solution.isValid(s1);
        boolean result2 = Solution.isValid(s2);
        boolean result3 = Solution.isValid(s3);

        System.out.println(result1); //true
        System.out.println(result2); //true
        System.out.println(result3); //false
    }
}
