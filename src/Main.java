public class Main {
    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
        String word3 = "ab", word4 = "pqrs";
        String word5 = "abcd", word6 = "pq";

        String result1 = Solution.mergeAlternately(word1, word2);
        String result2 = Solution.mergeAlternately(word3, word4);
        String result3 = Solution.mergeAlternately(word5, word6);

        System.out.println(result1); //"apbqcr"
        System.out.println(result2); //"apbqrs"
        System.out.println(result3); //"apbqcd"
    }
}
