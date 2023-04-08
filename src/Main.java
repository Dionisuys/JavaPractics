public class Main {
    public static void main(String[] args) {
        // Создаю узлы графа
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        // Устанавливаю связи между узлами
        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);

        // Создаю объект Solution
        Solution solution = new Solution();

        // Клонирую граф
        Node clonedNode = solution.cloneGraph(node1);

        /*Вывод результа с проверкой, что клонированный граф имеет те же
        значения и связи, что и оригинальный граф*/
        System.out.println(clonedNode.neighbors.get(0).val); // 2
        System.out.println(clonedNode.neighbors.get(1).val); // 4
        System.out.println(clonedNode.neighbors.get(0).neighbors.get(0).val); // 1
        System.out.println(clonedNode.neighbors.get(0).neighbors.get(1).val); // 3
        if (clonedNode.neighbors.size() > 2 && clonedNode.neighbors.get(2).
                neighbors.size() > 0) {
            System.out.println(clonedNode.neighbors.get(2).neighbors.get(0).val);
        }
        if (clonedNode.neighbors.size() > 2 && clonedNode.neighbors.get(2).
                neighbors.size() > 1) {
            System.out.println(clonedNode.neighbors.get(2).neighbors.get(1).val);
        }
    }
}
