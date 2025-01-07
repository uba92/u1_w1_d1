import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        int result = prodotto(3, 5);
        System.out.println(result);




        String newStr = concatenazione("Ciao", 9);
        System.out.println("la stringa concat è " + newStr);



        String[] arrayOfStrings = insertStr(new String[]{"A", "B", "C", "D", "E"}, "BOH" );
        System.out.println(Arrays.toString(arrayOfStrings));

    }
    public static int prodotto (int x, int y) {return x * y;}

    public static String concatenazione (String str, int x) {return str + x;}

    public static String[] insertStr (String[] arrOfStr, String newStr) {
        String[] newArray = new String[6];

        for (int i=0; i< newArray.length; i++) {
            if (i<3) {
                newArray[i] = arrOfStr[i];
            } else if (i == 3) {
                newArray[i] = newStr;
            } else {
                newArray[i] = arrOfStr[i - 1];
            }
        }
        return newArray;
    }

}