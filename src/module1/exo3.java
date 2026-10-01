package module1;

import java.util.Scanner;

public class exo3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        partieA();
        partieB();
        sc.close();


    }


    public static void partieA() {
        System.out.print("Entrez un nombre entier qu'on nommera a : ");
        int a = sc.nextInt();

        System.out.print("Entrez un nombre entier qu'on nommera b : ");
        int b = sc.nextInt();

        System.out.println("Magie, nous allons inverser les deux valeurs.. ");
        int c = b;
        b = a;
        a = c;

        System.out.println("a vaut desormais " + a + " et b vaut desormais : " + b);


    }

    public static void partieB() {
        System.out.print("Entrez un nombre entier qu'on nommera a : ");
        int a = sc.nextInt();

        System.out.print("Entrez un nombre entier qu'on nommera b : ");
        int b = sc.nextInt();

        System.out.println("Magie, nous allons inverser les deux valeurs.. ");
        b = a + b;
        a = b - a;
        b = b - a;

        System.out.print("a vaut desormais " + a + " et b vaut desormais : " + b);
    }

    public static void partieC() {
        // pas trouvé
    }

}
