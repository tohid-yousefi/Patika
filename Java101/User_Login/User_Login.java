package User_Login;

import java.util.Scanner;

public class User_Login {
    public static void main(String[] args) {
        String username, password, reset_password;

        Scanner input = new Scanner(System.in);
        System.out.println("*********** User Login ***********");
        System.out.println();

        System.out.print("Kullanıcı adınızı giriniz: ");
        username = input.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();

        if(username.equals("Tohid") && password.equals("123456")){
            System.out.println("Giriş Başarılı.");
        }else if(username.equals("Tohid") && !password.equals("123456")){
            System.out.println("Şifreniz Doğru Değil!!!");
            System.out.print("Şifrenizi sıfırlamak ister misiniz(Yes/No)?");
            reset_password = input.nextLine();
            if(reset_password.equals("Yes")){
                System.out.print("Yeni şifrenizi giriniz: ");
                password = input.nextLine();
                if(password.equals("123456")){
                    System.out.println("Şifre oluşturulamadı lütfen başka bir şifre giriniz.");
                } else if (password.equals("Tohid")) {
                    System.out.println("Kullanıcı adınız ile şifre aynı olamaz.");
                }
            }else{
                System.out.println("Tekrar görüşmek üzere :)");
            }
        }else if(!username.equals("Tohid") && password.equals("123456")){
            System.out.println("Kullanıcı Adınız Doğru Değil!!!");
        }else{
            System.out.println("Bilgileriniz Doğru Değil!!!");
        }
    }
}
