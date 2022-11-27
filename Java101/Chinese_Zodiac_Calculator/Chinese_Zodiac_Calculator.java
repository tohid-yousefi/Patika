package Chinese_Zodiac_Calculator;

import java.util.Scanner;

public class Chinese_Zodiac_Calculator {
    public static void main(String[] args) {

        int birthDate;
        String burc="";
        Scanner input = new Scanner(System.in);
        System.out.println("************ Chinese Zodiac Calculator ************");
        System.out.println();

        System.out.print("Doğum yılınızı giriniz(Ör. 1990): ");
        birthDate = input.nextInt();

        if(birthDate%12==0){
            burc = "Maymun";
        }else if(birthDate%12==1){
            burc = "Horoz";
        }else if(birthDate%12==2){
            burc = "Köpek";
        }else if(birthDate%12==3){
            burc = "Domuz";
        }else if(birthDate%12==4){
            burc = "Fare";
        }else if(birthDate%12==5){
            burc = "Öküz";
        }else if(birthDate%12==6){
            burc = "Kaplan";
        }else if(birthDate%12==7){
            burc = "Tavşan";
        }else if(birthDate%12==8){
            burc = "Ejderha";
        }else if(birthDate%12==9){
            burc = "Yılan";
        }else if(birthDate%12==10){
            burc = "At";
        }else if(birthDate%12==11){
            burc = "Koyun";
        }else{
            System.out.println("Geçerli bir doğum yılı girmediniz.");
        }
        System.out.println("Çin Zodyağı Burcunuz: " + burc);
    }
}
