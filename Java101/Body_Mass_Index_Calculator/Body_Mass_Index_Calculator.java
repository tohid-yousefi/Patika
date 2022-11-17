package Body_Mass_Index_Calculator;
import java.util.Scanner;

public class Body_Mass_Index_Calculator {
    public static void main(String[] args) {

        double boy,kilo;

        System.out.println("**************** Vücut Kitle İndeksi Hesaplama ****************");
        System.out.println();
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();

        double vucut_kitle_indeksi = kilo / (boy * boy);
        System.out.print("Vücut Kitle İndeksiniz : " + vucut_kitle_indeksi);
    }
}
