package module2;

import java.util.Scanner;

public class exo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez un nombre : ");
        int n = sc.nextInt();

        // à l'endroit
        for (int i = 1; i <= n; i++) {
            String star = "*";
            String result = star.repeat(i);
            System.out.println(result);
        }

        // à l'envers
        for (int i = n; i >= 1; i--) {
            String star = "*";
            String result = star.repeat(i);
            System.out.println(result);
        }

        //pyramide
        for (int i = 0; i < n; i++) {
            String star = "*";
            String space = " ";
            String result = star.repeat((i * 2) + 1);
            String resultSpace = space.repeat(n - i);
            System.out.print(resultSpace);
            System.out.print(result);
            System.out.print(resultSpace);
            System.out.println();
        }
        //pyramide inversé
        for (int i = n; i >= 0; i--) {
            String star = "*";
            String space = " ";
            String result = star.repeat((i * 2) + 1);
            String resultSpace = space.repeat(n - i);
            System.out.print(resultSpace);
            System.out.print(result);
            System.out.print(resultSpace);
            System.out.println();

        }

    }
}

//nbr espace triangle : 10,
// nbr etoile : 15

//nbr espace inverse : 10,
// nbr etoile : 15

//nbr espace pyramide : 20,
// nbr etoile : 25