import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //BMI = Body Mass Index/Vücut Kitle İndeksi

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu(metre cinsinden) giriniz:");
        double height = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz:");
        int weight = input.nextInt();

        double index = weight / (height * height);

        System.out.print("Vücut kitle indeksiniz:" + index);


    }
}