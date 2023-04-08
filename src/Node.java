import java.util.ArrayList;
import java.util.List;

class Node {
    public int val; // Значение узла
    public List<Node> neighbors; // Список соседних узлов

    public Node() { // Конструктор по умолчанию
        val = 0;
        neighbors = new ArrayList<Node>(); // Создаю пустой список для соседних узлов
    }

    public Node(int _val) { // Конструктор с одним параметром
        val = _val;
        neighbors = new ArrayList<Node>(); // Создаю пустой список для соседних узлов
    }

    public Node(int _val, ArrayList<Node> _neighbors) { // Конструктор с двумя параметрами
        val = _val;
        neighbors = _neighbors; // Инициализирую список соседних узлов переданным списком
    }
}
