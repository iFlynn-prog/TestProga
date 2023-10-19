package Level_2;
// Дано целое число. Выведите в консоль последнюю цифру этого числа.

public class Level2_2 {
    public static void main(String[] args) {
        int num = 12345;

        String numberString = Integer.toString(num);
        char lastNumber = numberString.charAt(numberString.length() - 1);
        System.out.println(lastNumber);

    }
}
