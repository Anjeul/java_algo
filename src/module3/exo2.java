package module3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exo2 {
    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, String> listeCourse = new HashMap<>();
    static int id = 0;

    public static void main(String[] args) {

        int option = 0;
        System.out.println("Bienvenue dans ta super liste de courses !");

        while (option != 5) {

            System.out.println(" --------- Que veux tu faire ? Appuie sur : --------- ");
            System.out.println("- 1 : Ajouter un article");
            System.out.println("- 2 : Supprimer un article");
            System.out.println("- 3 : Recherche un article");
            System.out.println("- 4 : Affiche la liste");
            System.out.println("- 5 : Quitter");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("---------------------------");
                    System.out.println("Ajouter un article");
                    addArticle();
                    break;
                case 2:
                    System.out.println("---------------------------");
                    System.out.println("Supprimer un article");
                    deleteArticle();
                    break;
                case 3:
                    System.out.println("---------------------------");
                    System.out.println("Recherche un article");
                    searchArticles();
                    break;
                case 4:
                    System.out.println("---------------------------");
                    System.out.println("Affiche la liste");
                    seeArticles();
                    break;
                case 5:
                    System.out.println("---------------------------");
                    System.out.println("Au revoir !");
                    break;
            }
        }
    }

    public static void addArticle() {
        System.out.println("Entrez un item :");
        String item = sc.nextLine();
        id++;
        listeCourse.put(id, item);
        System.out.println("---------------------------");
        System.out.println(item + " ajouté");
        System.out.println("Appuyez sur Entrée pour continuer");
        sc.nextLine();
    }

    public static void deleteArticle() {
        System.out.println("Entrez le nom de l'item a supprimer :");
        String input = sc.nextLine();
        String inputNoSpaceNoCapitalize = input.trim().toLowerCase();

        Integer idASupprimer = null;
        for (Map.Entry<Integer, String> entry : listeCourse.entrySet()) {
            String item = entry.getValue().trim().toLowerCase();

            if (inputNoSpaceNoCapitalize.equals(item)) {
                idASupprimer = entry.getKey();
                break;
            }
        }

        if (idASupprimer != null) {
            listeCourse.remove(idASupprimer);
            System.out.println("---------------------------");
            System.out.println("Supprimé avec succès");
        } else {
            System.out.println("---------------------------");
            System.out.println("Erreur : Item non trouvé.");
        }

        System.out.println("Appuyez sur Entrée pour continuer");
        sc.nextLine();
    }

    public static void searchArticles() {
        System.out.println("Entrez le nom de l'item a rechercher :");
        String input = sc.nextLine();
        String inputNoSpaceNoCapitalize = input.trim().toLowerCase();

        boolean trouve = false;
        String nomItem = null;

        for (Map.Entry<Integer, String> entry : listeCourse.entrySet()) {
            String item = entry.getValue().trim().toLowerCase();

            if (inputNoSpaceNoCapitalize.equals(item)) {
                trouve = true;
                nomItem = entry.getValue();
                break;
            }
        }

        if (trouve) {
            System.out.println("---------------------------");
            System.out.println(nomItem + " trouvé avec succès");
        } else {
            System.out.println("---------------------------");
            System.out.println("Erreur : Item non trouvé.");
        }

        System.out.println("Appuyez sur Entrée pour continuer");
        sc.nextLine();
    }

    public static void seeArticles() {
        listeCourse.forEach((id, item) -> {
            System.out.println("id : " + id + ". " + item);
        });
        System.out.println("---------------------------");
        System.out.println("Appuyez sur Entrée pour continuer");
        sc.nextLine();
    }
}
