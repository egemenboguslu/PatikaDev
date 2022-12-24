import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int k1, k2, k3;
        double u, alan, cevre;

        System.out.print("1. kenari giriniz:");
        k1 = input.nextInt();

        System.out.print("2.kenari giriniz:");
        k2 = input.nextInt();

        System.out.print("3.kenari giriniz:");
        k3 = input.nextInt();

        u = (k1 + k2 + k3) / 2;

        cevre = 2.0 * u;

        System.out.println("Üçgenin çevresi:" + cevre);

        alan = u * (u - k1) * (u - k2) * (u - k3);
        System.out.print("Üçgenin alani:" + Math.sqrt(alan));

    }
}