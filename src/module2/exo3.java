package module2;

import java.util.Locale;
import java.util.Scanner;


public class exo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Entrez un nombre entier : ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            String resultat = "";

            if (i % 3 == 0) {
                resultat += "Fizz";
            }
            if (i % 5 == 0) {
                resultat += "Buzz";
            }
            if (resultat.isEmpty()) {
                resultat = String.valueOf(i);
            }
            System.out.println(resultat);
        }

    }
}
