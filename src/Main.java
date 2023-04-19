public class Main {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(1);
        root.right.left.left = null;
        root.right.left.right = null;
        root.right.right.left = null;
        root.right.right.right = new TreeNode(1);
        root.right.right.right.left = new TreeNode(1);
        root.right.right.right.right = null;
        root.right.right.right.left.left = null;
        root.right.right.right.left.right = new TreeNode(1);


        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(1);
        root2.left.left = null;
        root2.left.right = new TreeNode(1);
        root2.right.left = null;
        root2.right.right = null;
        root2.left.right.left = new TreeNode(1);
        root2.left.right.right = null;
        root2.left.right.left.left = null;
        root2.left.right.left.right = new TreeNode(1);


        TreeNode root3 = new TreeNode(1);

        int result = Solution.longestZigZag(root);
        int result2 = Solution.longestZigZag(root2);
        int result3 = Solution.longestZigZag(root3);

        System.out.println(result); //3
        System.out.println(result2); //4
        System.out.println(result3); //0

    }
}
