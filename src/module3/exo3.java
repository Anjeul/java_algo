package module3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class exo3 {
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, Integer> wordArray = new HashMap<>();

    public static void main(String[] args) {


        System.out.print("Entrez un phrase : ");
        String phrase = sc.nextLine();
        String phraseUser = phrase.toLowerCase();
        String[] words = phraseUser.split(" ");

        for (String word : words) {
            int counter = 1;
            if (!wordArray.containsKey(word)) {
                wordArray.put(word, counter);
            } else {
                counter = wordArray.get(word);
                counter++;
                wordArray.put(word, counter);
            }
        }
        trier(wordArray);

    }

    public static void trier(HashMap<String, Integer> wordArray) {
        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(wordArray.entrySet());
        entries.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
    }
}
