import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        System.out.println("Yarıçapı giriniz: ");
        Scanner input = new Scanner(System.in);

        double r = input.nextDouble();
        double Alan = r*r* Math.PI;
        double Cevre = 2 * r * Math.PI;

        System.out.println("Çemberin Alanı: "+ Alan);
        System.out.println("Çemberin Çevresi: "+ Cevre);
    }
}
