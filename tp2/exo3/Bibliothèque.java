package tp2.exo3;

import java.util.Scanner;

public class Bibliothèque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Livre livrePoche = new Livre();

        System.out.println("Saisir le titre du livre: ");
        livrePoche.setTitre(scanner.nextLine());

        System.out.println("Saisir le nom de l'auteur: ");
        livrePoche.setNomAuteur(scanner.nextLine());

        System.out.println("Saisir le prénom de l'auteur: ");
        livrePoche.setPrenomAuteur(scanner.nextLine());

        System.out.println("Saisir la catégorie du livre: ");
        livrePoche.setCategorie(scanner.nextLine());

        System.out.println("Saisir le numéro ISBN: ");
        livrePoche.setISBN(Integer.parseInt(scanner.nextLine()));

        afficherTitreEtCode(livrePoche);

        Livre unPolar = new Livre("Le mystère de la chambre jaune", "Leroux", "Gaston", "Policier", 225300549);
        afficherTitreEtCode(unPolar);

        scanner.close();
    }

    public static void afficherTitreEtCode(Livre livre) {
        System.out.println("Titre: " + livre.getTitre());
        System.out.println("Code: " + livre.getCode());
    }
}