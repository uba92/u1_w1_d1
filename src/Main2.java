import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        concatStr();


    }

    public static void concatStr () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa");
        String string1 = scanner.nextLine();

        System.out.println("Inserisci un'altra stringa");
        String string2 = scanner.nextLine();

        System.out.println("Inserisci un'ultima stringa");
        String string3 = scanner.nextLine();

        System.out.println(string1 + string2 + string3);
        System.out.println(string3 + string2 + string1);
    }
}
