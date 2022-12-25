import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int secim, sayi1, sayi2, sonuc;

        System.out.println("Toplama işlemi için 1'e basın.");
        System.out.println("Çıkarma işlemi için 2'ye basın.");
        System.out.println("Çarpma işlemi için 3'e basın.");
        System.out.println("Bölme işlemi için 4'e basın.");

        System.out.print("Birinci sayiyi giriniz:");
        sayi1 = input.nextInt();

        System.out.print("İkinci sayiyi giriniz:");
        sayi2 = input.nextInt();

        System.out.print("Lütfen 1-4 arasi seçim yapiniz:");
        secim = input.nextInt();

        if (sayi2 == 0 && secim == 4) {
            System.out.print("Sayi2 0'a bölünemez");
        } else {
            switch (secim) {
                case 1:
                    sonuc = sayi1 + sayi2;
                    System.out.print("Toplama sonucu:" + sonuc);
                    break;

                case 2:
                    sonuc = sayi1 - sayi2;
                    System.out.print("Çıkarma sonucu:" + sonuc);
                    break;

                case 3:
                    sonuc = sayi1 * sayi2;
                    System.out.print("Çarpma sonucu:" + sonuc);
                    break;

                case 4:
                    sonuc = sayi1 / sayi2;
                    System.out.print("Bölme sonucu:" + sonuc);
                    break;

                default:
                    System.out.print("Hatali secim yaptiniz.");
            }

        }

    }
}