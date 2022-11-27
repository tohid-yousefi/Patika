package Leap_Year_Calculation;

import java.util.Scanner;

public class Leap_Year_Calculation {
    public static void main(String[] args) {

        int year;
        boolean isLeapYear;

        Scanner input = new Scanner(System.in);
        System.out.println("************ Leap Year Calculation ************");
        System.out.println();

        System.out.print("Yılı giriniz(Ör. 1990): ");
        year = input.nextInt();

        if(year%100==0){
            if(year%400==0){
                isLeapYear = true;
            }else{
                isLeapYear = false;
            }
        }else if(year%4==0){
            isLeapYear = true;
        }else{
            isLeapYear = false;
        }

        if(isLeapYear){
            System.out.println(year + " bir artık yıldır.");
        }else{
            System.out.println(year + " bir artık yıl değildir.");
        }

    }
}
