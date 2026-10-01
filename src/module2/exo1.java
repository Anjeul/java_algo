package module2;

import java.util.Locale;
import java.util.Scanner;

public class exo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Entrez un premier nombre : ");
        double nbr1 = sc.nextDouble();

        System.out.print("Entrez un opérateur (+, -, *, /) : ");
        char operateur = sc.next().charAt(0);

        System.out.print("Entrez un deuxième nombre : ");
        double nbr2 = sc.nextDouble();
        
        double resultat;
        String messageErreur;

        switch (operateur) {
            case '+':
                resultat = nbr1 + nbr2;
                System.out.println("Résultat : " + resultat);
                break;

            case '-':
                resultat = nbr1 - nbr2;
                System.out.println("Résultat : " + resultat);
                break;

            case 'x':
            case '*':
                resultat = nbr1 * nbr2;
                System.out.println("Résultat : " + resultat);
                break;

            case '/':
                if (nbr2 == 0) {
                    messageErreur = "Erreur : division par zero";
                    System.out.println(messageErreur);
                } else {
                    resultat = nbr1 / nbr2;
                    System.out.println("Résultat : " + resultat);
                }
                break;

            default:
                messageErreur = "Erreur : operateur inconnu";
                System.out.println(messageErreur);
        }

        sc.close();

    }
}

