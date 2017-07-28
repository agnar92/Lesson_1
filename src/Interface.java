
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


/**
 * Created by KomputerK on 10.05.2017.
 */
public class Interface {
    static Scanner scanner = new Scanner(System.in);
    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");

    public static void main(String[] args) {
        Kot kot = new Kot();

        System.out.print("Podaj imie kota:");
        kot.setImie(getScanner());
        System.out.print("Podaj imie Opiekuna:");
        kot.setImieOpiekuna(getScanner());
        System.out.println("Data urodzenia kota: ");
        try {
            kot.setDataUrodzenia(sdf.parse(getScanner()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Podaj wage kota: ");
        kot.setWagaKota(Float.parseFloat(getScanner()));


        System.out.println("Imie kota: " + kot.getImie() );
        System.out.println("Imie opiekuna: " + kot.getImieOpiekuna());
        System.out.println("Data urodzenia: " + kot.getDataUrodzenia());
        System.out.println("Waga: " + kot.getWagaKota());



    }

    public static String getScanner(){
        return scanner.nextLine();
    }


}
