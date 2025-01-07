import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero:");
        int x = scanner.nextInt();

        System.out.print("Inserisci un altro numero intero:");
        int y = scanner.nextInt();

        System.out.print("Il prodotto tra " + x + " e " + y + " è: " + x*y);
    }
}