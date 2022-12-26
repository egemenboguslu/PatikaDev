import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int sicaklik;

        System.out.print("Sicaklik değerini giriniz:");
        sicaklik = inp.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yapabilirsin.");
        } else if (sicaklik < 25) {
            if (sicaklik >= 5 && sicaklik < 10) {
                System.out.println("Sinemaya gidebilirsin.");
            } else if (sicaklik >= 10 && sicaklik <= 15) {
                System.out.println("Sinema veya Pikniğe gidebilirsin.");
            } else {
                System.out.println("Pikniğe gidebilirsin.");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsin.");
        }

    }
}