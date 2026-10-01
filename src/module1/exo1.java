package module1;

import java.util.Scanner;


public class exo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Entrer une température en C° pour la convertir en F° : ");
        while (!sc.hasNextDouble()) {
            System.out.println("Erreur, veuillez entrer un nombre : ");
            sc.next();
            System.out.println("Reessayer");
        }
        double celsius = sc.nextDouble();

        double farenheit = celsius * 9 / 5 + 32;


        System.out.println("L’équivalent en Farenheit est : " + farenheit + " F°");

        sc.close();

    }
}
