import java.lang.Math;
import java.util.Scanner;

public class Gravitacija {
    public static void main(String[] args) {
        System.out.println("OIS je zakon!");
        System.out.print("nadmorska visina: ");
        Scanner sc = new Scanner(System.in);
        int visina = sc.nextInt();
        
        izpis(visina);
    }

    public static void izpis(int visina) {
        double C = 6.674 * Math.pow(10, -11);
        double M = 5.972 * Math.pow(10, 24);
        double r = 6.371 * Math.pow(10, 6);

        double a = (C * M) / (Math.pow(r + visina,2));

        System.out.println("nadmorska visina: " + visina + " m");
        System.out.println("gravitacijski pospesek: " + a + " m/s^2");
    }

    public static double pospesekNaVisini(int v) {
        double C = 6.674 * Math.pow(10, -11);
        double M = 5.972 * Math.pow(10, 24);
        double r = 6.371 * Math.pow(10, 6);

        double a = (C * M) / (Math.pow(r + v,2));

        return a;
    }
}