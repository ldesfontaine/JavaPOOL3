package tp3.gestionEtudiants;

import java.util.ArrayList;

/**
 * Représente un étudiant avec un nom, une liste de notes et une moyenne.
 */
public class Etudiant {
    private String nom;
    private ArrayList<Integer> listeNotes;
    private double moyenne;

    /**
     * Constructeur pour créer un étudiant avec un nom.
     *
     * @param nom le nom de l'étudiant
     */
    public Etudiant(String nom){
        this.nom = nom;
        this.listeNotes = new ArrayList<Integer>();
        this.moyenne = 0;
    }

    /**
     * Retourne la moyenne des notes de l'étudiant.
     *
     * @return la moyenne
     */
    public double getMoyenne(){
        return this.moyenne;
    }

    /**
     * Retourne le nom de l'étudiant.
     *
     * @return le nom de l'étudiant
     */
    public String getNom(){
        return this.nom;
    }

    /**
     * Retourne la liste des notes de l'étudiant.
     *
     * @return la liste des notes
     */
    public ArrayList<Integer> getListeNotes(){
        return this.listeNotes;
    }

    /**
     * Ajoute une note à la liste de l'étudiant et met à jour la moyenne.
     * La note est limitée entre 0 et 20.
     *
     * @param note la note à ajouter
     */
    public void ajouterNote(int note){
        if(note < 0){
            note = 0;
        }
        if(note > 20){
            note = 20;
        }
        this.listeNotes.add(note);
        this.moyenne = (moyenne * (listeNotes.size() - 1) + note) / listeNotes.size();
    }

    /**
     * Retourne une représentation textuelle de l'étudiant, incluant le nom et la moyenne.
     *
     * @return une chaîne représentant l'étudiant
     */
    public String toString(){
        return this.nom + " (" + this.moyenne + ")";
    }

    /**
     * Méthode principale de test de la classe Etudiant.
     *
     * @param args les arguments de la ligne de commande
     */
    public static void main(String[] args){
        Etudiant etudiant = new Etudiant("Allan");
        etudiant.ajouterNote(12);
        etudiant.ajouterNote(14);
        etudiant.ajouterNote(16);
        System.out.println(etudiant);
    }
}
