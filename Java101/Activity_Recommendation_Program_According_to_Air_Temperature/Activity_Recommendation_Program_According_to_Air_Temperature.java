package Activity_Recommendation_Program_According_to_Air_Temperature;

import java.util.Scanner;

public class Activity_Recommendation_Program_According_to_Air_Temperature {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.println("************ Activity Recommendation Program According to Air Temperature ************");
        System.out.println();

        System.out.print("Sıcaklık giriniz: ");
        heat = input.nextInt();

            if(heat<5){
                System.out.println("Kayak yapabilirsiniz");
            } else if(heat<=25){
                if(heat<=15){
                    System.out.println("Sinemaya gidebilirsiniz");
                }
                if(heat>=10){
                    System.out.println("Pikniğe gidebilirsiniz");
                }
            }else{
                System.out.println("Yüzmeye gidebilirsiniz");
            }

    }
}
