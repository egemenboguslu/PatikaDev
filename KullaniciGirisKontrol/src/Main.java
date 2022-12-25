import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userName, password, newPassword;

        System.out.print("Kullanıcı adını giriniz:");
        userName = input.nextLine();

        System.out.print("Şifreyi giriniz:");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java101")) {
            System.out.println("Giriş başarılı");
        } else {
            System.out.println("Hatalı kullanıcı adı veya şifre.");
            System.out.print("Şifrenizi sıfırlamak ister misiniz ? (evet veya hayır):");

            String cevap = input.nextLine();

            if (cevap.equals("evet")) {
                System.out.print("Yeni şifreyi giriniz: ");
                newPassword = input.nextLine();

                if (newPassword.equals("java101")) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                    System.out.print("Yeni şifreniz:" + newPassword);
                }
            }
        }

    }
}