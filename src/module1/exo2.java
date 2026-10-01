package module1;

import java.util.Locale;
import java.util.Scanner;

public class exo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Entrez le prix d'un article HT : ");
        double prixHT = sc.nextDouble();

        System.out.print("Entrez le taux de la TVA : ");
        double tauxTVA = sc.nextDouble();

        System.out.print("Entrez le taux de remise, si il n'y en a pas, entrez 0 : ");
        double tauxRemise = sc.nextDouble();

        double montantTVA = prixHT * tauxTVA / 100;
        double prixTTC = prixHT + montantTVA;
        double montantRemise = prixTTC * tauxRemise / 100;
        double prixFinal = prixTTC - montantRemise;


        System.out.println("Le montant de TVA appliqué est : " + montantTVA + " euro. Le prix TTC est : " + prixTTC + " euro. Le montant de la remise appliqué est : " + montantRemise + " euro. Le prix final de l'objet est : " + prixFinal + " euro.");

        sc.close();

    }
}
