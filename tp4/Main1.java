package tp4;

public class Main1 {
    public static void main(String[] args) {
        Garage g = new Garage();

        Option clim = new Option("O1", "Climatisation", 1200);
        Option airbag = new Option("O2", "Airbag", 800);
        Option gps = new Option("O3", "GPS", 600);
        g.ajouterOptionCatalogue(clim);
        g.ajouterOptionCatalogue(airbag);
        g.ajouterOptionCatalogue(gps);

        Neuve n1 = new Neuve("NNV-123", 20000);
        n1.ajouterOption(clim);
        n1.ajouterOption(gps);
        Neuve n2 = new Neuve("NNV-456", 18000);
        n2.ajouterOption(airbag);

        Occasion o1 = new Occasion("OC-789", 15000, 30000, 2);
        Occasion o2 = new Occasion("OC-321", 12000, 10000, 1);

        g.ajouterVoiture(n1);
        g.ajouterVoiture(n2);
        g.ajouterVoiture(o1);
        g.ajouterVoiture(o2);

        g.afficherCatalogueOptions();
        System.out.println();
        g.afficherVoituresTrieesParPrix();
    }
}

