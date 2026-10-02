package module2;

import java.util.Scanner;

public class exo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre : ");
        int n = sc.nextInt();

        System.out.printf("%1s", " ");
        System.out.printf("%2s", "|");

        for (int r = 1; r <= n; r++) {
            System.out.printf("%3s", r);
        }
        System.out.println();

        for (int j = 1; j <= n; j++) {
            System.out.printf("%3s", "----");
        }

        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.printf("%3s", i + " |");
            for (int j = 1; j <= n; j++) {

                System.out.printf("%3s", i * j);
            }
            System.out.println(" ");

        }
    }
}