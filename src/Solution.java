public class Solution {
    static int maxLen = 0; // Объявляю статическую переменную для хранения максимальной длины

    // Метод для нахождения максимальной длины zigzag-последовательности
    public static int longestZigZag(TreeNode root) {
        // Если дерево пустое, то длина равна 0
        if (root == null) {
            return 0;
        }
        maxLen = 0; // Обнуляю максимальную длину перед поиском
        // Вызываю поиск для левого и правого поддеревьев
        dfs(root.left, 1, true);
        dfs(root.right, 1, false);
        // Возвращаю максимальную длину
        return maxLen;
    }

    // Метод для поиска zigzag-последовательности в поддереве
    private static void dfs(TreeNode node, int len, boolean isLeft) {
        // Если узел равен null, то выхожу из метода
        if (node == null) {
            return;
        }
        // Обновляю максимальную длину
        maxLen = Math.max(maxLen, len);
        // Если текущий узел - левый, то вызываю поиск для правого поддерева и левого дочернего узла
        if (isLeft) {
            dfs(node.right, len + 1, false);
            dfs(node.left, 1, true);
        }
        // Иначе вызываю поиск для левого поддерева и правого дочернего узла
        else {
            dfs(node.left, len + 1, true);
            dfs(node.right, 1, false);
        }
    }
}
