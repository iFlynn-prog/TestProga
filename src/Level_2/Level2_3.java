package Level_2;
// Дано целое число. Выведите в консоль сумму первой и последней цифры этого числа.

public class Level2_3 {
    public static void main(String[] args) {
        int num = 123456;
        System.out.println(firstNumber(num) + lastNumber(num));
    }
    public static int lastNumber(int num) {

        return num % 10;
    }

    public static int firstNumber(int num) {
        if (num / 10 == 0) {
            return num;
        }
        return firstNumber(num / 10);
    }

}
