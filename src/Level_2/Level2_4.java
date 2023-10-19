package Level_2;
// Дано целое число. Выведите количество цифр в этом числе.

public class Level2_4 {

    public static void main(String[] args) {
        int num = 123456;
        String numberString = Integer.toString(num);
        System.out.println(numberString.length());
    }
}
