package Horoscope_Finder_Program;

import java.util.Scanner;

public class Horoscope_Finder_Program {
    public static void main(String[] args) {

        int month,day;
        String burc = "";

        Scanner input = new Scanner(System.in);
        System.out.println("************ Horoscope Finder Program ************");
        System.out.println();

        System.out.print("Doğduğunuz ayı giriniz: ");
        month = input.nextInt();

        System.out.print("Doğduğunuz günü giriniz: ");
        day = input.nextInt();

        switch(month){
            case 1:
                if(day>=1 && day<=31){
                    if(day<22){
                        burc = "Oğlak";
                    }else{
                        burc = "Kova";
                    }
                }else{
                    System.out.println("Lütfen girdiğiniz gün 1 ile 31 arasında olmasına dikkat ediniz.");
                }
                break;
            case 2:
                if(day>=1 && day<=28){
                    if(day<20){
                        burc = "Kova";
                    }else{
                        burc = "Balık";
                    }
                }else{
                    System.out.println("Lütfen girdiğiniz gün 1 ile 28 arasında olmasına dikkat ediniz.");
                }
                break;
            case 3:
                if(day>=1 && day<=31){
                    if(day<21){
                        burc = "Balık";
                    }else{
                        burc = "Koç";
                    }
                }else{
                    System.out.println("Lütfen girdiğiniz gün 1 ile 31 arasında olmasına dikkat ediniz.");
                }
                break;
            case 4:
                if(day>=1 && day<=30){
                    if(day<21){
                        burc = "Koç";
                    }else{
                        burc = "Boğa";
                    }
                }else{
                    System.out.println("Lütfen girdiğiniz gün 1 ile 30 arasında olmasına dikkat ediniz.");
                }
                break;
            case 5:
                if(day>=1 && day<=31){
                    if(day<22){
                        burc = "Boğa";
                    }else{
                        burc = "İkizler";
                    }
                }else{
                    System.out.println("Lütfen girdiğiniz gün 1 ile 31 arasında olmasına dikkat ediniz.");
                }
                break;
            case 6:
                if(day>=1 && day<=30){
                    if(day<23){
                        burc = "İkizler";
                    }else{
                        burc = "Yengeç";
                    }
                }else{
                    System.out.println("Lütfen girdiğiniz gün 1 ile 30 arasında olmasına dikkat ediniz.");
                }
                break;
            case 7:
                if(day>=1 && day<=31){
                    if(day<23){
                        burc = "Yengeç";
                    }else{
                        burc = "Aslan";
                    }
                }else{
                    System.out.println("Lütfen girdiğiniz gün 1 ile 31 arasında olmasına dikkat ediniz.");
                }
                break;
            case 8:
                if(day>=1 && day<=31){
                    if(day<23){
                        burc = "Aslan";
                    }else{
                        burc = "Başak";
                    }
                }else{
                    System.out.println("Lütfen girdiğiniz gün 1 ile 31 arasında olmasına dikkat ediniz.");
                }
                break;
            case 9:
                if(day>=1 && day<=30){
                    if(day<23){
                        burc = "Başak";
                    }else{
                        burc = "Terazi";
                    }
                }else{
                    System.out.println("Lütfen girdiğiniz gün 1 ile 30 arasında olmasına dikkat ediniz.");
                }
                break;
            case 10:
                if(day>=1 && day<=31){
                    if(day<23){
                        burc = "Terazi";
                    }else{
                        burc = "Akrep";
                    }
                }else{
                    System.out.println("Lütfen girdiğiniz gün 1 ile 31 arasında olmasına dikkat ediniz.");
                }
                break;
            case 11:
                if(day>=1 && day<=30){
                    if(day<22){
                        burc = "Akrep";
                    }else{
                        burc = "Yay";
                    }
                }else{
                    System.out.println("Lütfen girdiğiniz gün 1 ile 30 arasında olmasına dikkat ediniz.");
                }
                break;
            case 12:
                if(day>=1 && day<=31){
                    if(day<22){
                        burc = "Yay";
                    }else{
                        burc = "Oğlak";
                    }
                }else{
                    System.out.println("Lütfen girdiğiniz gün 1 ile 31 arasında olmasına dikkat ediniz.");
                }
                break;
            default:
                System.out.println("Girilen ay doğru değil.");
        }
        System.out.println("Burcunuz: " + burc);
    }
}
