import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int acilisUcreti = 10, KM, minTutar = 20;

        System.out.print("Gidilen mesafeyi yaziniz:");
        KM = input.nextInt();

        double toplamUcret = acilisUcreti + (KM * 2.2);

        toplamUcret = (toplamUcret > minTutar) ? toplamUcret : minTutar;
        System.out.println("Ödenecek tutar: " + toplamUcret);

    }
}