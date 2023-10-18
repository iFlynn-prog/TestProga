package Level_1;

/**
 * Дано слово. Получите его последнюю букву.
 * Если слово заканчивается на мягкий знак, то получите предпоследнюю букву.
 */

public class Level1_6 {
    public static void main(String[] args) {
        String str = "Пельмень";
        char res1 = 'ь';


        if (str.charAt(str.length() - 1) == res1) {
            res1 = str.charAt(str.length() - 2);
            System.out.println(res1);
        } else {
            System.out.println("Ваше слово" + res1);
        }
    }
}
