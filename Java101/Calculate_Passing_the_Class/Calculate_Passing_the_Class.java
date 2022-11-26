package Calculate_Passing_the_Class;

import java.util.Scanner;

public class Calculate_Passing_the_Class {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);
        System.out.println("************ Grade Point Average Calculator ************");
        System.out.println();

        System.out.print("Matematik Notunuz: ");
        matematik = input.nextInt();
        matematik = (matematik<0 || matematik>100) ? 0 : matematik;

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        fizik = (fizik<0 || fizik>100) ? 0 : fizik;

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        kimya = (kimya<0 || kimya>100) ? 0 : kimya;

        System.out.print("Turkce notunuz: ");
        turkce = input.nextInt();
        turkce = (turkce<0 || turkce>100) ? 0 : turkce;

        System.out.print("Tarih notunuz: ");
        tarih = input.nextInt();
        tarih = (tarih<0 || tarih>100) ? 0 : tarih;

        System.out.print("Muzik notunuz: ");
        muzik = input.nextInt();
        muzik = (muzik<0 || muzik>100) ? 0 : muzik;

        double sonuc = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
        if(sonuc>55){
            System.out.println("Geçtiniz");
        }else{
            System.out.println("Kaldınız");
        }
        System.out.println("Ortalamaniz: " + sonuc);
    }
}
