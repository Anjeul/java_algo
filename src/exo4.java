import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class exo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);


        System.out.print("Quel est votre poids ? (en kg) : ");
        double poids = sc.nextDouble();

        System.out.print("Quel est votre taille ? (en m.cm ) : ");
        double taille = sc.nextDouble();

        double imcBrut = poids / Math.pow(taille, 2);
        BigDecimal imc = new BigDecimal(imcBrut);
        imc = imc.setScale(2, RoundingMode.HALF_UP);

        if (imc.doubleValue() < 18.5) {
            System.out.println("Avec votre imc de  : " + imc + ", vous êtes en insuffisance pondérale.");
        } else if (imc.doubleValue() < 24.9) {
            System.out.println("Avec votre imc de  : " + imc + ", vous avez un poids normal.");
        } else if (imc.doubleValue() < 29.9) {
            System.out.println("Avec votre imc de  : " + imc + ", vous êtes en surpoids.");
        } else {
            System.out.println("Avec votre imc de  : " + imc + ", vous êtes en obésité.");
        }


        sc.close();

    }
}
