import java.util.Stack;

class Solution {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int num : pushed) {
            stack.push(num); // добавляю элемент в стек
            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop(); // удаляю элемент из стека
                j++; // увеличиваю индекс массива popped
            }
        }
        return j == popped.length; /*проверяю, что все элементы из popped
                                     были удалены из стека*/
    }
}
