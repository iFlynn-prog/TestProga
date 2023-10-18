// Дано целое число. Выведите в консоль первую цифру этого числа.

package Level_2;

public class Level1_2 {
    public static void main(String[] args) {
        int a = 123456;
        String numberString = Integer.toString(a);
        char firstNumber = numberString.charAt(0);
        System.out.println(firstNumber);
    }
}
