package module2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Character, Integer> chiffresRomains = new HashMap<>();

        chiffresRomains.put('I', 1);
        chiffresRomains.put('V', 5);
        chiffresRomains.put('X', 10);
        chiffresRomains.put('L', 50);
        chiffresRomains.put('C', 100);
        chiffresRomains.put('D', 500);
        chiffresRomains.put('M', 1000);

        System.out.print("Entrez un chiffre romain (IVXLCDM) : ");
        String chaineDeChiffresRomains = sc.next();


        int result = 0;
        for (int i = 0; i < chaineDeChiffresRomains.length(); i++) {
            char one = chaineDeChiffresRomains.charAt(i);

            if (i + 1 < chaineDeChiffresRomains.length() && chiffresRomains.get(one) < chiffresRomains.get(chaineDeChiffresRomains.charAt(i + 1))) {
                char two = chaineDeChiffresRomains.charAt(i + 1);
                result = result + (chiffresRomains.get(two) - chiffresRomains.get(one));
                i++;
            } else {
                result = result + chiffresRomains.get(one);
            }
        }

        System.out.print(result);



/*        System.out.print("Entrez un chiffre romain : ");
        String n = sc.next();
        while (!chiffresRomains.containsKey(n)) {
            System.out.print("Entrez un chiffre romain.");
            n = sc.next();

        }*/
        // Récupérer une valeur

    }
}