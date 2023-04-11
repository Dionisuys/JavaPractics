public class Main {
    public static void main(String[] args) {
        String s1 = "leet**cod*e";
        String s2 = "erase*****";

        String result1 = Solution.removeStars(s1);
        String result2 = Solution.removeStars(s2);

        System.out.println(result1); //"lecoe"
        System.out.println(result2); //""
    }
}
