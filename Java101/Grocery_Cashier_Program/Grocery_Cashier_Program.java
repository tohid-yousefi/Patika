package Grocery_Cashier_Program;
import java.util.Scanner;

public class Grocery_Cashier_Program {
    public static void main(String[] args) {
        double kilo=0, armutPerKilo=2.14, elmaPerKilo=3.67, domatesPerKilo=1.11, muzPerKilo=0.95, patlicanPerKilo=5, total=0;

        System.out.println("********* Manav Kasa Programı *********");
        System.out.println();

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        kilo = input.nextDouble();
        total+=kilo*armutPerKilo;

        System.out.print("Elma Kaç Kilo ? : ");
        kilo = input.nextDouble();
        total+=kilo*elmaPerKilo;

        System.out.print("Domates Kaç Kilo ? : ");
        kilo = input.nextDouble();
        total+=kilo*domatesPerKilo;

        System.out.print("Muz Kaç Kilo ? : ");
        kilo = input.nextDouble();
        total+=kilo*muzPerKilo;

        System.out.print("Patlıcan Kaç Kilo ? : ");
        kilo = input.nextDouble();
        total+=kilo*patlicanPerKilo;

        System.out.println("Toplam tutar: " + total);
    }
}
