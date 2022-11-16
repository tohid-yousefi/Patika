package Tax_Amount_Calculator_Program;
import java.util.Scanner;

public class Tax_Amount_Calculator_Program {
    public static void main(String[] args) {
        System.out.println("*********** Tax Amount Calculator Program");
        System.out.println();
        Scanner input = new Scanner(System.in);

        System.out.print("Fiyatı Giriniz: ");
        double tutar = input.nextDouble();
        double kdv_orani;
        if (tutar>0 && tutar < 1000){
             kdv_orani = 18;
        }
        else if(tutar > 1000){
             kdv_orani = 8;
        }
        else{
            kdv_orani = 18;
        }
        double kdvli_tutar = (tutar*kdv_orani/100) + tutar;
        double kdv_tutari = tutar*kdv_orani/100;
        System.out.println("KDV'siz tutar: " + tutar);
        System.out.println("KDV oranı: " + kdv_orani);
        System.out.println("KDV'li tutar: " + kdvli_tutar);
        System.out.println("KDV tutari: " + kdv_tutari);

    }
}
