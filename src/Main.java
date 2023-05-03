import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3}, nums2 = {2, 4, 6};
        int[] nums3 = {1, 2, 3, 3}, nums4 = {1, 1, 2, 2};
        List<List<Integer>> result = Solution.findDifference(nums1, nums2);
        List<List<Integer>> result2 = Solution.findDifference(nums3, nums4);

        System.out.println(result);
        System.out.println(result2);
    }
}
