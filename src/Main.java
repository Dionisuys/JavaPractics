public class Main {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.left = null;
        root.right.right = new TreeNode(9);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(3);
        root2.right = new TreeNode(2);
        root2.left.left = new TreeNode(5);
        root2.left.right = null;
        root2.right.left = null;
        root2.right.right = new TreeNode(9);
        root2.left.left.left = new TreeNode(6);
        root2.left.left.right = null;
        root2.right.right.left = new TreeNode(7);

        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(3);
        root3.right = new TreeNode(2);
        root3.left.left = new TreeNode(5);

        int result = Solution.widthOfBinaryTree(root);
        int result2 = Solution.widthOfBinaryTree(root2);
        int result3 = Solution.widthOfBinaryTree(root3);

        System.out.println(result); //4
        System.out.println(result2); //7
        System.out.println(result3); //2
    }
}
