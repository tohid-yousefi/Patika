package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int num1, num2;
        char op;

        Scanner input = new Scanner(System.in);
        System.out.println("*********** Calculator ***********");
        System.out.println();

        System.out.print("Birinci sayınızı giriniz: ");
        num1 = input.nextInt();

        System.out.print("Yapmak istediğiniz işlemi giriniz(+-*/): ");
        op = input.next().charAt(0);

        System.out.print("Ikinci sayınızı giriniz: ");
        num2 = input.nextInt();

        switch(op){
            case '+':
                System.out.println("Toplam: " + (num1+num2));
                break;
            case '-':
                System.out.println("Çıkarma: " + (num1-num2));
                break;
            case '*':
                System.out.println("Çarpma: " + (num1*num2));
                break;
            case '/':
                if(num2!=0){
                    System.out.println("Bölme: " + (num1/num2));
                    break;
                }else{
                    System.out.println("Bölme işlemi yapılamaz.");
                }

        }

    }
}
