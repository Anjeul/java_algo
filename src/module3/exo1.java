package module3;

import java.util.Arrays;


public class exo1 {
    public static void main(String[] args) {
        int[] tab = {10, 20, 30, 40, 50};
        afficherStats(tab);
    }

    public static int findMin(int[] tab) {
        int minimum = tab[0];
        for (int item : tab) {
            if (minimum > item) {
                minimum = item;
            }
        }
        return minimum;
    }

    public static int findMax(int[] tab) {
        int maximum = tab[0];
        for (int item : tab) {
            if (maximum < item) {
                maximum = item;
            }
        }
        return maximum;
    }

    public static int findAvg(int[] tab) {
        int somme = 0;
        for (int item : tab) {
            somme = somme + item;
        }
        int moyenne = somme / tab.length;
        return moyenne;
    }

    public static void ecartType() {
        // j'y arrive pas du tout
    }

    public static void afficherStats(int[] tab) {
        System.out.println("Tableau : [" + Arrays.toString(tab) + "]");
        System.out.println("Moyenne : [" + findAvg(tab) + "]");
        System.out.println("Max : [" + findMax(tab) + "]");
        System.out.println("Min : [" + findMin(tab) + "]");
    }
}
