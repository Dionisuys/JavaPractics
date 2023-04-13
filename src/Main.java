public class Main {
    public static void main(String[] args) {
        int[] nums1 = {3,7,1,6};
        int[] nums2 = {10,1};

        int result1 = Solution.minimizeArrayValue(nums1);
        int result2 = Solution.minimizeArrayValue(nums2);

        System.out.println(result1); //5
        System.out.println(result2); //10
    }
}
