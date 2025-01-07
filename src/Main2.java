import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa");
        String str1 = scanner.nextLine();

        System.out.println("Inserisci un'altra stringa");
        String str2 = scanner.nextLine();

        System.out.println("Inserisci un'ultima stringa");
        String str3 = scanner.nextLine();


        System.out.println(str1 + str2 + str3);
        System.out.println(str3 + str2 + str1);
    }
}
