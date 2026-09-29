import java.util.Scanner;

public class exo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre entier qu'on nommera a : ");
        int a = sc.nextInt();

        System.out.print("Entrez un nombre entier qu'on nommera b : ");
        int b = sc.nextInt();

        System.out.println("Magie, nous allons inverser les deux valeurs..");
        int c = b;
        b = a;
        a = c;

        System.out.print("a vaut desormais " + a + " et b vaut desormais : " + b);


        sc.close();

    }
}
