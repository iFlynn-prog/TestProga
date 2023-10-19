package Level_2;
// Даны два целых числа. Проверьте, что первые цифры этих чисел совпадают.

public class Level2_5 {
    public static void main(String[] args) {
        int firstnum = 12345;

        int lastnum = 213452;

        String firstnumString = Integer.toString(firstnum);
        String lastnumString = Integer.toString(lastnum);

        char fcharnum = firstnumString.charAt(0);
        char lcharnum = lastnumString.charAt(0);


        if (fcharnum == lcharnum){
            System.out.println("Совпадают");
        } else {
            System.out.println("Не совпадают");
        }



    }
}
