package Level_3;
// Дана строка. Если в этой строке более одного символа, выведите в консоль предпоследний символ этой строки.

public class Level3_2 {
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(str.charAt(str.length() - 2));
    }
}
