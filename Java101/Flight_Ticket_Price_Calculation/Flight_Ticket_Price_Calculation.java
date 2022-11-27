package Flight_Ticket_Price_Calculation;

import java.util.Scanner;

public class Flight_Ticket_Price_Calculation {
    public static void main(String[] args) {

        int mesafe,yas,yolculuk_tipi;
        double bilet_tutari;

        Scanner input = new Scanner(System.in);
        System.out.println("************ Flight Ticket Price Calculation ************");
        System.out.println();

        System.out.print("Mesafeyi giriniz(km): ");
        mesafe = input.nextInt();

        System.out.print("Yaşınız giriniz: ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz(1 => Tek-Yön , 2 => Gidiş-Dönüş): ");
        yolculuk_tipi = input.nextInt();

        bilet_tutari = mesafe * 0.10;

        if(mesafe>0 && yas>0 && (yolculuk_tipi==1 || yolculuk_tipi==2)){
            if(yas<12){
                bilet_tutari = bilet_tutari - (bilet_tutari*50/100);
            }else if(yas>=12 && yas<=24){
                bilet_tutari = bilet_tutari - (bilet_tutari*10/100);
            }else if(yas>65){
                bilet_tutari = bilet_tutari - (bilet_tutari*30/100);
            }
            if(yolculuk_tipi==2){
                bilet_tutari = (bilet_tutari - (bilet_tutari*20/100))*2;
            }
            System.out.println("Toplab Bilet Tutarı: " + bilet_tutari);
        }else{
            System.out.println("Mesafe ve Yaş Pozitif Olmasi Gerekir. Ayrıca Yolculuk Tipi 1 veya 2 Olarak Belirlenmeli.");
        }

    }
}
