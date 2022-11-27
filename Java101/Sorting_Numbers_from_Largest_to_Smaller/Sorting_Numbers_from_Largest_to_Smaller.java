package Sorting_Numbers_from_Largest_to_Smaller;

import java.util.Scanner;

public class Sorting_Numbers_from_Largest_to_Smaller {
    public static void main(String[] args) {

        int num1,num2,num3;

        Scanner input = new Scanner(System.in);
        System.out.println("************ Sorting Numbers from Largest to Smaller ************");
        System.out.println();

        System.out.print("Birinci sayıyı giriniz: ");
        num1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        num2 = input.nextInt();

        System.out.print("Üçüncü sayıyı giriniz: ");
        num3 = input.nextInt();

        if(num1>num2 && num1>num3){
            if(num2>num3){
                System.out.println(num1 + ">" + num2 + ">" + num3);
            }else{
                System.out.println(num1 + ">" + num3 + ">" + num2);
            }
        }else if(num2>num1 && num2>num3){
            if(num1>num3){
                System.out.println(num2 + ">" + num1 + ">" + num3);
            }else{
                System.out.println(num2 + ">" + num3 + ">" + num1);
            }
        }else if(num3>num1 && num3>num2){
            if(num1>num2){
                System.out.println(num3 + ">" + num1 + ">" + num2);
            }else{
                System.out.println(num3 + ">" + num2 + ">" + num1);
            }
        }

    }
}
