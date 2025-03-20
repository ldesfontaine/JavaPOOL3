package tp2.exo3;

import java.util.Scanner;

public class Livre {
        private String titre;
        private String nomAuteur;
        private String prenomAuteur;
        private String categorie;
        private Integer ISBN;
        private String code;

        // GETTERS ET SETTERS

        public String getTitre() {
                return titre;
        }

        public void setTitre(String titre) {
                this.titre = titre;
        }

        public String getNomAuteur() {
                return nomAuteur;
        }

        public void setNomAuteur(String nomAuteur) {
                this.nomAuteur = nomAuteur;
        }

        public String getPrenomAuteur() {
                return prenomAuteur;
        }

        public void setPrenomAuteur(String prenomAuteur) {
                this.prenomAuteur = prenomAuteur;
        }

        public String getCategorie() {
                return categorie;
        }

        public void setCategorie(String categorie) {
        }

        public Integer getISBN() {
                return ISBN;
        }

        public void setISBN(Integer ISBN) {
                this.ISBN = ISBN;
        }

        public String getCode() {
                return code;
        }

        private void setCode() {
                String nomPart = nomAuteur.substring(0, 2);
                String prenomPart = prenomAuteur.substring(0, 2);
                String isbnPart = ISBN.toString().substring(0, 2);
                this.code = nomPart + prenomPart + isbnPart;
        }



        // FIN DES GETTERS ET SETTERS

        public Livre() {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Saisir le titre du livre: ");
                this.setTitre(scanner.nextLine());

                System.out.println("Saisir le nom de l'auteur: ");
                this.setNomAuteur(scanner.nextLine());

                System.out.println("Saisir le prénom de l'auteur: ");
                this.setPrenomAuteur(scanner.nextLine());

                System.out.println("Saisir la catégorie du livre: ");
                this.setCategorie(scanner.nextLine());

                System.out.println("Saisir le numéro ISBN: ");
                this.setISBN(Integer.parseInt(scanner.nextLine()));

                this.setCode();
        }

        // OVERIIDE
        public Livre(String titre, String nomAuteur, String prenomAuteur, String categorie, Integer ISBN) {
                this.setTitre(titre);
                this.setNomAuteur(nomAuteur);
                this.setPrenomAuteur(prenomAuteur);
                this.setCategorie(categorie);
                this.setISBN(ISBN);
                this.setCode();
        }
}