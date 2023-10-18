package Level_1;

// Даны два слова. Проверьте, что первые буквы этих слов совпадают.
public class Level1_5 {
    public static void main(String[] args) {
        String str1 = "Hello world";
        String str2  = "ЙHello cat";

        char a = str1.toLowerCase().charAt(0);
        char b = str2.toLowerCase().charAt(0);

        if(a == b){
            System.out.println("Совпадают");
        }else{
            System.out.println("Не совпадают");
        }


    }

}
