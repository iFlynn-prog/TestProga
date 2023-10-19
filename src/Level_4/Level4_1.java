package Level_4;

// Выведите в консоль все четные числа из промежутка от 1 до 100.
public class Level4_1 {
    public static void main(String[] args) {
        int[] arr = new int[100];

        for (int i = 0; i <= arr.length; i = i + 2) {
            System.out.print(" " + i);
        }
    }
}
