import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double para;

        System.out.print("Para tutarini giriniz:");
        para = input.nextDouble();

        if (para > 0 && para < 1000) {
            double kdvOrani1 = 0.18;
            double kdvTutari1 = para * kdvOrani1;
            System.out.println("KDV tutari = " + kdvTutari1);

            double toplam = kdvTutari1 + para;
            System.out.print("Toplam fiyat:" + toplam);

        } else if(para>=1000){
            double kdvOrani2 = 0.08;
            double kdvTutari2 = para * kdvOrani2;
            System.out.println("KDV tutari = " + kdvTutari2);

            double toplam = kdvTutari2 + para;
            System.out.print("Toplam fiyat:" + toplam);
        }
        else {
            System.out.println("Lütfen mantıklı para degeri giriniz. :)");
        }

    }
}