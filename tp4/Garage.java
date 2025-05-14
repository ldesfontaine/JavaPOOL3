package tp4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/** Classe Garage pour gérer voitures et options */
class Garage {
    private List<Option> catalogueOptions;
    private List<Voiture> voitures;

    public Garage() {
        catalogueOptions = new ArrayList<>();
        voitures = new ArrayList<>();
    }

    public void ajouterOptionCatalogue(Option opt) {
        catalogueOptions.add(opt);
    }

    public void ajouterVoiture(Voiture v) {
        voitures.add(v);
    }

    public void afficherCatalogueOptions() {
        System.out.println("Catalogue des options :");
        for (Option opt : catalogueOptions) {
            System.out.println(opt);
        }
    }

    public void afficherVoituresTrieesParPrix() {
        Collections.sort(voitures, Comparator.comparingDouble(Voiture::getPrix));
        System.out.println("Liste des véhicules par ordre croissant de prix :");
        for (Voiture v : voitures) {
            System.out.println(v);
        }
    }
}