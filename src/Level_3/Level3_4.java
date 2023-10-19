package Level_3;

/**  Дано целое число, содержащее номер месяца от 1 до 12:
        byte num = 1;
        Определите, в какую пору года попадает этот месяц. */
public class Level3_4 {
    public static void main(String[] args) {

        int num = 3;
        switch (num) {
            case 1:
            System.out.println("Зима");
            break;
            case 2:
                System.out.println("Весна");
                break;
            case 3:
                System.out.println("Лето");
                break;
            case 4:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такой поры года не найдено");
        }
    }
}
