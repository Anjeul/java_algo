package module1;

import java.util.Locale;
import java.util.Scanner;

public class exo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Entrez la longueur de votre mur (en mètre) : ");
        double longueur = sc.nextDouble();

        System.out.print("Entrez la largeur de votre mur (en mètre) : ");
        double largeur = sc.nextDouble();

        System.out.print("Entrez la hauteur de votre mur (en mètre) : ");
        double hauteur = sc.nextDouble();

        double contenancePot = 10;
        double prixPot = 29.90;
        double tauxPorteFenetre = 0.8;

        double perimetre = (longueur + largeur) * 2;
        double surface = perimetre * hauteur;
        double surfaceBrute = surface * tauxPorteFenetre;
        double surfaceNet = Math.round(surfaceBrute * 100.0) / 100.0;

        double nbrPot = surfaceNet / contenancePot;
        int nbrPotArrondi = (int) Math.ceil(nbrPot);

        double prixBrut = nbrPotArrondi * prixPot;
        double prixTotal = Math.round(prixBrut * 100.0) / 100.0;

        System.out.println("La surface net est de : " + surfaceNet + "m². Il vous faudra " + nbrPotArrondi + " pot(s), pour un total de " + prixTotal + " euros.");

        sc.close();

    }
}
