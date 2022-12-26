import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dogumTarihi;

        System.out.print("Doğum Yılınızı Giriniz :");
        dogumTarihi = input.nextInt();

        int cinZodyagi = (dogumTarihi % 12);

        if (cinZodyagi == 0) {
            System.out.print("Çin Zodyağı Burcunuz : Maymun");
        } else if (cinZodyagi == 1) {
            System.out.print("Çin Zodyağı Burcunuz : Horoz");
        } else if (cinZodyagi == 2) {
            System.out.print("Çin Zodyağı Burcunuz : Köpek");
        } else if (cinZodyagi == 3) {
            System.out.print("Çin Zodyağı Burcunuz : Domuz");
        } else if (cinZodyagi == 4) {
            System.out.print("Çin Zodyağı Burcunuz : Fare");
        } else if (cinZodyagi == 5) {
            System.out.print("Çin Zodyağı Burcunuz : Öküz");
        } else if (cinZodyagi == 6) {
            System.out.print("Çin Zodyağı Burcunuz : Kaplan");
        } else if (cinZodyagi == 7) {
            System.out.print("Çin Zodyağı Burcunuz : Tavşan");
        } else if (cinZodyagi == 8) {
            System.out.print("Çin Zodyağı Burcunuz : Ejderha");
        } else if (cinZodyagi == 9) {
            System.out.print("Çin Zodyağı Burcunuz : Yılan");
        } else if (cinZodyagi == 10) {
            System.out.print("Çin Zodyağı Burcunuz : At");
        } else if (cinZodyagi == 0) {
            System.out.print("Çin Zodyağı Burcunuz : Koyun");
        } else {
            System.out.println("Hata.");
        }
    }
}