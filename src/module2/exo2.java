package module2;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class exo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        Random random = new Random();

        int nbrAleatoire = random.nextInt(100) + 1;

        System.out.print("Entrez un nombre et essayez de deviner ce que j'ai en tête : ");
        int nbrUtilisateur = sc.nextInt();

        int compteur = 0;

        do {
            if (nbrUtilisateur > nbrAleatoire) {
                System.out.println("Plus grand !");
                nbrUtilisateur = sc.nextInt();
                compteur++;
            }
            if (nbrUtilisateur < nbrAleatoire) {
                System.out.println("Plus petit !");
                nbrUtilisateur = sc.nextInt();
                compteur++;
            } else {
                System.out.println("Veuillez entrer un nombre..");
            }
        } while (nbrAleatoire == nbrUtilisateur);
        System.out.print("Bravo !! Trouvé en " + compteur + " essais");

    }
}