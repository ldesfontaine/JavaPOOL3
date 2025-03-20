package tp3.gestionEtudiants;

import java.util.ArrayList;

/**
 * Représente un groupe d'étudiants.
 */
public class GroupeEtudiants {
    private ArrayList<Etudiant> listeEtudiants;

    /**
     * Retourne le nombre d'étudiants dans le groupe.
     *
     * @return le nombre d'étudiants
     */
    public int nombre() {
        return listeEtudiants.size();
    }

    /**
     * Retourne la liste des étudiants.
     *
     * @return la liste des étudiants
     */
    public ArrayList<Etudiant> getListe() {
        return listeEtudiants;
    }

    /**
     * Ajoute un étudiant au groupe.
     *
     * @param etudiant l'étudiant à ajouter
     */
    public void ajouterEtudiant(Etudiant etudiant) {
        listeEtudiants.add(etudiant);
    }

    /**
     * Cherche et retourne un étudiant par son nom.
     *
     * @param nom le nom de l'étudiant recherché
     * @return l'étudiant correspondant ou null s'il n'est pas trouvé
     */
    public Etudiant chercher(String nom) {
        for (Etudiant etudiant : listeEtudiants) {
            if (etudiant.getNom().equals(nom)) {
                return etudiant;
            }
        }
        return null;
    }

    /**
     * Affiche les informations de tous les étudiants du groupe.
     */
    public void lister() {
        for (Etudiant etudiant : listeEtudiants) {
            System.out.println(etudiant.toString());
        }
    }
}
