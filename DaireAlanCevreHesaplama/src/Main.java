import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pi = 3.14, alan, cevre, dilimAlani;
        int yaricap, merkezAci;

        System.out.print("Dairenin yaricapini giriniz:");
        yaricap = input.nextInt();

        System.out.print("Merkez açısının ölçüsünü giriniz:");
        merkezAci = input.nextInt();

        cevre = 2.0 * pi * yaricap;
        alan = pi * yaricap * yaricap;
        dilimAlani = (pi * (yaricap * yaricap) * merkezAci) / 360;

        System.out.println("Dairenin cevresi:" + cevre);
        System.out.println("Dairenin alani:" + alan);
        System.out.println("Daire diliminin alani:" + dilimAlani);

    }
}