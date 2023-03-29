public class task1 {
    public static void main(String[] args) {
        System.out.println(buildString(6, 'a', 'b'));
    }

// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая состоит из 
// чередующихся символов c1 и c2, начиная с c1.
// Пример. (n = 6, c1='a', c2='b') -> "ababab"
// (n = 8, c1='x', c2='y') -> "xyxyxyxy"

static String buildString(int n, char c1, char c2) {
    String str1 = new String();
    for (int i = 0; i < n; i++) {
        if (i == 0 || i % 2 == 0) {
            str1 += c1;
        }
        else {
            str1 += c2;
        }
    }
    return str1;
}

}