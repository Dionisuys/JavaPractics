import java.math.BigInteger;

class Solution {
    public static int numberOfArrays(String s, int k) {
        int n = s.length(); // длина строки s
        int[] dp = new int[n + 1]; // массив для хранения количества валидных последовательностей
        dp[0] = 1; // начальное значение
        int mod = (int) 1e9 + 7; // модуль для вычисления по модулю
        // прохожусь по всем элементам строки s
        for (int i = 1; i <= n; i++) {
            int cur = 0; // текущее количество последовательностей
            // прохожусь по всем возможным разбиениям отрезка s[j, i]
            for (int j = i - 1; j >= Math.max(i - log10(k) - 1, 0); j--) {
                // пропускаю варианты с ведущими нулями
                if (s.charAt(j) == '0') continue;
                // вычисляю текущее число и проверяю, что оно не превышает k
                BigInteger num = new BigInteger(s.substring(j, i)); // получаю число из текущего отрезка
                if (num.compareTo(BigInteger.valueOf(k)) > 0)
                    break; // если число больше k, то дальнейшие итерации не имеют смысла
                cur = (cur + dp[j]) % mod; // обновляю счетчик возможных вариантов
            }
            dp[i] = cur; // сохраняю количество возможных вариантов для i-го элемента
        }
        return dp[n]; // возвращаю количество возможных вариантов для всей строки s
    }

    // функция для вычисления логарифма по основанию 10
    private static int log10(int x) {
        return (int) Math.floor(Math.log10(x));
    }
}
