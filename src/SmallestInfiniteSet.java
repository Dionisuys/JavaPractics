import java.util.*;

public class SmallestInfiniteSet {
    // Использую Set для хранения множества положительных чисел
    private static Set<Integer> set;

    // Конструктор для инициализации множества, которое содержит все положительные числа
    public SmallestInfiniteSet() {
        set = new HashSet<>();
        for (int i = 1; i <= 1000; i++) {
            set.add(i); // Добавляю числа от 1 до 100 в множество
        }
    }

    // Метод для удаления наименьшего числа из множества и его возврата
    public int popSmallest() {
        if (set.isEmpty()) { // Если множество пустое, вернуть -1
            return -1;
        }
        //Использую метод Collections.min для получения наименьшего числа в множестве
        int smallest = Collections.min(set);
        set.remove(smallest); // Удаляю наименьшее число из множества
        return smallest; // Возвращаю удаленное наименьшее число
    }

    // Метод для добавления положительного числа в множество, если оно еще не содержится в нем
    public void addBack(int num) {
        set.add(num); // Добавляю число в множество
    }
}
