package Calculate_Area_and_Perimeter_Circle;
import java.util.Scanner;

public class Calculate_Area_and_Perimeter_Circle {
    public static void main(String[] args) {
        int r;
        double pi=3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("************** Dairenin Alanını ve Çevresini Hesaplayan Program **************");
        System.out.println();
        System.out.print("Dairenin yarı çapını giriniz: ");
        r = input.nextInt();
        double alan = pi * Math.pow(r,2);
        double cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);
    }
}
