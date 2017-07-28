import java.util.Scanner;

/**
 * Created by KomputerK on 10.05.2017.
 */
public class HelloWordApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("podaj imie: ");
        String imieUrzytkownika = getUserInput();
        System.out.println("Wpisane imie: " + imieUrzytkownika);

    }

    public static String getUserInput() {
        return scanner.nextLine();
    }
}
