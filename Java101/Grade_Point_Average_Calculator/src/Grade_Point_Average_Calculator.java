import java.util.Scanner;
public class Grade_Point_Average_Calculator {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);
        System.out.println("************ Grade Point Average Calculator ************");
        System.out.println();

        System.out.print("Matematik Notunuz: ");
        matematik = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("Turkce notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = input.nextInt();

        System.out.print("Muzik notunuz: ");
        muzik = input.nextInt();

        double sonuc = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println("Ortalamaniz: " + sonuc);
        String durum = sonuc>60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println("Durumunuz: " + durum);

    }
}
