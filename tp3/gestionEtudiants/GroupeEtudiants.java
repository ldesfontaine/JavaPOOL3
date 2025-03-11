package tp3.gestionEtudiants;

import java.util.ArrayList;

public class GroupeEtudiants {
    private ArrayList<Etudiant> listeEtudiants;

    public int nombre() {
        return listeEtudiants.size();
    }

    public ArrayList<Etudiant> getListe() {
        return listeEtudiants;
    }

    public void ajouterEtudiant(Etudiant etudiant) {
        listeEtudiants.add(etudiant);
    }

    public Etudiant chercher(String nom) {
        for (Etudiant etudiant : listeEtudiants) {
            if (etudiant.getNom().equals(nom)) {
                return etudiant;
            }
        }
        return null;
    }

    public void lister() {
        for (Etudiant etudiant : listeEtudiants) {
            System.out.println(etudiant.toString());
        }
    }
}
