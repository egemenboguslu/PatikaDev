import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int matematik, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen matematik notunuzu giriniz:");
        matematik = input.nextInt();

        System.out.print("Lütfen fizik notunuzu giriniz:");
        fizik = input.nextInt();

        System.out.print("Lütfen kimya notunuzu giriniz:");
        kimya = input.nextInt();

        System.out.print("Lütfen türkçe notunuzu giriniz:");
        turkce = input.nextInt();

        System.out.print("Lütfen tarih notunuzu giriniz:");
        tarih = input.nextInt();

        System.out.print("Lütfen müzik notunuzu giriniz:");
        muzik = input.nextInt();

        int total = (matematik + tarih + turkce + fizik + muzik + kimya);
        double result = total / 6;

        System.out.println("Ortalamaniz:" + result);

        String gecmeDurumu = result >= 60? "Sınıfı Gecti" : "Sınıfta kaldi.";
        System.out.println(gecmeDurumu);
    }
}