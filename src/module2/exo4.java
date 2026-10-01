package module2;

import java.util.Scanner;

public class exo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Testez la validité de votre mot de passe : ");
        String mdpUser = sc.next();

        isPasswordValid(mdpUser);
    }

    public static void isPasswordValid(String mdp) {
        System.out.println(hasEnoughCharacters(mdp) ? "Contient assez de caractères : Ok" : "Contient assez de caractères : Pas ok");
        System.out.println(hasUpper(mdp) ? "Contient une majuscule : Ok" : "Contient une majuscule : Pas ok");
        System.out.println(hasLower(mdp) ? "Contient une minuscule : Ok" : "Contient une minuscule : Pas ok");
        System.out.println(hasNumber(mdp) ? "Contient un chiffre : Ok" : "Contient un chiffre : Pas ok");
        boolean everythingIsOk = hasEnoughCharacters(mdp) && hasUpper(mdp) && hasLower(mdp) && hasNumber(mdp);

        if (everythingIsOk) {
            System.out.print("Mot de passe valide, je vais hacker tes comptes");
        } else {
            System.out.print("Non ! Pas valide !");
        }
    }


    public static boolean hasEnoughCharacters(String mdp) {
        return mdp.length() >= 8;
    }

    public static boolean hasUpper(String mdp) {
        return mdp.matches(".*[A-Z].*");
    }

    public static boolean hasLower(String mdp) {
        return mdp.matches(".*[a-z].*");
    }

    public static boolean hasNumber(String mdp) {
        return mdp.matches(".*\\d.*");
    }
}
