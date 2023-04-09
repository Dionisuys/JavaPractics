import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int largestPathValue(String colors, int[][] edges) {
        int vertex = colors.length(); // количество вершин в графе
        int color = 26; // количество цветов (маленьких латинских букв)

        /*Инициализирую двумерный массив dp размера (vertex, color).
        dp[i][j] будет хранить количество узлов с цветом j на самом длинном
        пути от вершины 0 до вершины i.*/
        int[][] dp = new int[vertex][color];

        /*Инициализирую массив inDegree размера vertex. inDegree[i] будет
        хранить количество входящих ребер в вершину i.*/
        int[] inDegree = new int[vertex];

        // Заполняю inDegree и dp для вершины 0.
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            inDegree[to]++;
            dp[from][colors.charAt(to) - 'a']++; // обновляю счетчик цветов
        }

        // Инициализирую очередь bfs.
        Queue<Integer> bfs = new LinkedList<>();
        for (int i = 0; i < vertex; i++) {
            if (inDegree[i] == 0) {
                bfs.offer(i);
            }
        }

        int visited = 0; // количество посещенных вершин
        while (!bfs.isEmpty()) {
            int curr = bfs.poll();
            visited++;

            // Обновляю dp для всех соседей вершины curr.
            for (int[] edge : edges) {
                int from = edge[0];
                int to = edge[1];
                if (from == curr) {
                    /*Если есть возможность перейти от вершины curr к вершине to,
                    я обновляю массив dp для вершины to.*/
                    for (int j = 0; j < color; j++) {
                        dp[to][j] = Math.max(dp[to][j], dp[from][j] +
                                (colors.charAt(to) - 'a' == j ? 1 : 0));
                    }
                    // Уменьшаю счетчик входящих ребер для вершины to.
                    inDegree[to]--;
                    if (inDegree[to] == 0) {
                        bfs.offer(to);
                    }
                }
            }
        }

        // Если количетсво посещений меньше чем n вершин, значит, граф содержит цикл.
        if (visited < vertex) {
            return -1;
        }

        // Поиск наибольшего значения в массиве dp.
        int result = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < color; j++) {
                result = Math.max(result, dp[i][j]);
            }
        }

        return result;
    }
}
