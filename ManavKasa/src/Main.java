import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0;

        System.out.print("Armut kaç kilo ? :");
        int kgArmut = input.nextInt();
        double toplamArmut = kgArmut * armut;

        System.out.print("Elma kaç kilo ? :");
        int kgElma = input.nextInt();
        double toplamElma = kgElma * elma;

        System.out.print("Domates kaç kilo ? :");
        int kgDomates = input.nextInt();
        double toplamDomates = kgDomates * domates;

        System.out.print("Muz kaç kilo ? :");
        int kgMuz = input.nextInt();
        double toplamMuz = kgMuz * muz;

        System.out.print("Patlıcan kaç kilo ? :");
        int kgPatlican = input.nextInt();
        double toplamPatlican = kgPatlican * patlican;

        double toplam = toplamArmut + toplamDomates + toplamMuz + toplamElma + toplamPatlican;

        System.out.print("Toplam tutar:" + toplam);
    }
}