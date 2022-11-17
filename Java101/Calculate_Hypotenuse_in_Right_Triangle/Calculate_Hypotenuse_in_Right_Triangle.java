package Calculate_Hypotenuse_in_Right_Triangle;
import java.util.Scanner;

public class Calculate_Hypotenuse_in_Right_Triangle {
    public static void main(String[] args) {
        int a,b,c;

        Scanner input = new Scanner(System.in);
        System.out.println("*********** Calculate Hypotenuse in Right Triangle ***********");
        System.out.println();

        System.out.print("birinci kenarı yazınız: ");
        a = input.nextInt();

        System.out.print("ikinci kenarı yazınız: ");
        b = input.nextInt();

        System.out.print("üçüncü kenarı yazınız: ");
        c = input.nextInt();

        double u = (a+b+c)/2;
        double sonuc = Math.sqrt((u*(u-a)*(u-b)*(u-c)));

        System.out.println("Üçgenin Alanı: " + sonuc);

    }
}
