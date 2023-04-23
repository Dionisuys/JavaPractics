public class Main {
    public static void main(String[] args) {

        String s = "1000", s2 = "1000", s3 = "1317";
        int k = 10000, k2 = 10, k3 = 2000;

        int result = Solution.numberOfArrays(s, k);
        int result2 = Solution.numberOfArrays(s2, k2);
        int result3 = Solution.numberOfArrays(s3, k3);

        System.out.println(result); //1
        System.out.println(result2); //0
        System.out.println(result3); //8
    }
}
