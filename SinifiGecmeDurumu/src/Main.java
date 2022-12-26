import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int matematik, türkce, fizik, kimya, muzik;
        int toplam = 0, dersSayisi = 0;
        double ort;

        System.out.print("Matematik notunu giriniz:");
        matematik = input.nextInt();
        if ((matematik > 0) && (matematik <= 100)) {
            toplam = toplam + matematik;
            dersSayisi++;
        }

        System.out.print("Türkce notunu giriniz:");
        türkce = input.nextInt();
        if ((türkce > 0) && (türkce <= 100)) {
            toplam = toplam + türkce;
            dersSayisi++;
        }

        System.out.print("Fizik notunu giriniz:");
        fizik = input.nextInt();
        if ((fizik > 0) && (fizik <= 100)) {
            toplam = toplam + fizik;
            dersSayisi++;
        }

        System.out.print("Kimya notunu giriniz:");
        kimya = input.nextInt();
        if ((kimya > 0) && (kimya <= 100)) {
            toplam = toplam + kimya;
            dersSayisi++;
        }

        System.out.print("Müzik notunu giriniz:");
        muzik = input.nextInt();
        if ((muzik > 0) && (muzik <= 100)) {
            toplam = toplam + muzik;
            dersSayisi++;
        }

        ort = toplam / dersSayisi;

        if (ort >= 60) {
            System.out.println("Ortalamaniz:" + ort);
            System.out.println("Sinifi gectiniz.");
        } else {
            System.out.println("Ortalamaniz:" + ort);
            System.out.println("Kaldiniz.");
        }

    }
}