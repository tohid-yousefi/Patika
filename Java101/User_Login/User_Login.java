package User_Login;

import java.util.Scanner;

public class User_Login {
    public static void main(String[] args) {
        String username,password;

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
        }else if(!username.equals("Tohid") && password.equals("123456")){
            System.out.println("Kullanıcı Adınız Doğru Değil!!!");
        }else{
            System.out.println("Bilgileriniz Doğru Değil!!!");
        }
    }
}
