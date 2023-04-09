import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null; // Если входной узел равен null, то возвращаю null
        }
        HashMap<Node, Node> map = new HashMap<>(); // Создаю HashMap для хранения копий узлов
        Node clone = new Node(node.val, new ArrayList<>()); // Создаю копию входного узла
        map.put(node, clone); // Добавляю оригинальный узел и его копию в HashMap
        Queue<Node> queue = new LinkedList<>(); // Создаю очередь для обхода графа в ширину
        queue.offer(node); // Добавляю оригинальный узел в очередь
        while (!queue.isEmpty()) {
            Node cur = queue.poll(); // Извлекаю первый элемент из очереди
            for (Node neighbor : cur.neighbors) { // Обхожу всех соседей текущего узла
                if (!map.containsKey(neighbor)) { // Если копия соседнего узла еще не создана, то создаю ее
                    Node neighborClone = new Node(neighbor.val, new ArrayList<>());
                    map.put(neighbor, neighborClone); // Добавляю оригинальный узел и его копию в HashMap
                    queue.offer(neighbor); // Добавляю соседний узел в очередь для его обработки
                }
                map.get(cur).neighbors.add(map.get(neighbor)); // Добавляю копию соседнего узла к копии текущего узла
            }
        }
        return clone; // Возвращаю копию входного узла
    }
}
