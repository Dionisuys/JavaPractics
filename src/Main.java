import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] candies1 = {2, 3, 5, 1, 3};
        int extraCandies1 = 3;

        int[] candies2 = {4, 2, 1, 1, 2};
        int extraCandies2 = 1;

        int[] candies3 = {12, 1, 12};
        int extraCandies3 = 10;

        List<Boolean> result1 = Solution.kidsWithCandies(candies1, extraCandies1);
        List<Boolean> result2 = Solution.kidsWithCandies(candies2, extraCandies2);
        List<Boolean> result3 = Solution.kidsWithCandies(candies3, extraCandies3);

        System.out.println(result1); //true,true,true,false,true
        System.out.println(result2); //true,false,false,false,false
        System.out.println(result3); //true,false,true
    }
}
