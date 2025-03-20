package tp3.gestionEtudiants;

import java.util.ArrayList;

public class Etudiant {
    private String nom;
    private ArrayList<Integer> listeNotes;
    private double moyenne;

    public Etudiant(String nom){
        this.nom = nom;
        this.listeNotes = new ArrayList<Integer>();
        this.moyenne = 0;
    }

    public double getMoyenne(){
        return moyenne;
    }

    public String getNom(){
        return nom;
    }

    public ArrayList<Integer> getListeNotes(){
        return listeNotes;
    }

    public void ajouterNote(int note){
        if(note < 0){
            note = 0;
        }
        if(note > 20){
            note = 20;
        }
        listeNotes.add(note);
        moyenne = (moyenne * (listeNotes.size() - 1) + note) / listeNotes.size();
    }

    public String toString(){
        return nom + " (" + moyenne + ")";
    }

    public static void main(String[] args){
        Etudiant etudiant = new Etudiant("Allan");
        etudiant.ajouterNote(12);
        etudiant.ajouterNote(14);
        etudiant.ajouterNote(16);
        System.out.println(etudiant);
    }
}
