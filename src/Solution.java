public class Solution {
    public static String mergeAlternately(String word1, String word2) {
        // Создаю новый объект StringBuilder для объединенной строки
        StringBuilder mergedString = new StringBuilder();

        // Инициализирую указатели i и j
        int i = 0;
        int j = 0;

        // Прохожу по обеим строкам, добавляя буквы в альтернативном порядке
        while (i < word1.length() && j < word2.length()) {
            // Добавляю букву из word1
            mergedString.append(word1.charAt(i++));

            // Добавляю букву из word2
            mergedString.append(word2.charAt(j++));
        }

        /*Если одна из строк была длиннее другой, добавляю оставшиеся буквы в
          конец объединенной строки*/
        if (i < word1.length()) {
            mergedString.append(word1.substring(i));
        }

        if (j < word2.length()) {
            mergedString.append(word2.substring(j));
        }

        // Возвращаю объединенную строку
        return mergedString.toString();
    }
}
