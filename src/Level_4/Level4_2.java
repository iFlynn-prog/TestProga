package Level_4;

//    Дана некоторая строка:
//    String str = "abcde";
//    Переберите и выведите в консоль по очереди все символы с конца строки.
public class Level4_2 {
    public static void main(String[] args) {
        String str = " abcd";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }
    }
}
