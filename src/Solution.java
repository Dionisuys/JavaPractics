import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        // Нахожу максимальное количество конфет в массиве
        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }

        // Создаю список булевых значений для хранения результатов
        List<Boolean> result = new ArrayList<>();
        // Проверяю каждого ребенка в массиве candies
        for (int candy : candies) {
            /*Если количество конфет ребенка + extraCandies больше или равно
            максимальному количеству конфет, то ребенок будет иметь наибольшее
            количество конфет после добавления extraCandies*/
            result.add(candy + extraCandies >= maxCandies);
        }

        // Возвращаю список булевых значений
        return result;
    }
}
