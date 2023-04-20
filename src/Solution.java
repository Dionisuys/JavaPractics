import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static int widthOfBinaryTree(TreeNode root) {
        // Создаю список для хранения левых позиций узлов на каждом уровне
        List<Integer> lefts = new ArrayList<>();
        // Создаю массив для хранения максимальной ширины дерева
        int[] res = new int[1];
        // Вызываю метод dfs для обхода дерева и вычисления максимальной ширины
        dfs(root, 0, 1, lefts, res);
        // Возвращаю максимальную ширину дерева
        return res[0];
    }

    private static void dfs(TreeNode node, int depth, int pos,
                            List<Integer> lefts, int[] res) {
        if (node == null) {
            return;
        }
        // Если текущий уровень еще не был посещен, добавляю левую позицию текущего узла в список
        if (depth >= lefts.size()) {
            lefts.add(pos);
        }
        // Вычисляю максимальную ширину дерева на текущем уровне и обновляю значение в массиве res
        res[0] = Math.max(res[0], pos - lefts.get(depth) + 1);
        // Рекурсивно вызываю метод dfs для левого и правого поддеревьев
        dfs(node.left, depth + 1, pos * 2, lefts, res);
        dfs(node.right, depth + 1, pos * 2 + 1, lefts, res);
    }
}
