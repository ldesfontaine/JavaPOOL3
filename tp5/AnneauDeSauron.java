package tp5;

public class AnneauDeSauron extends Anneau {
    private static AnneauDeSauron instance;

    private AnneauDeSauron(Personnage porteur) {
        super("Anneau de Sauron", porteur);
    }

    public static AnneauDeSauron getInstance(Personnage porteur) {
        if (instance == null) {
            instance = new AnneauDeSauron(porteur);
        }
        return instance;
    }

    @Override
    public void passerAuDoigt() {
        System.out.println(this.porteur.nom + " devient invisible.");
    }

    @Override
    public void enleverDuDoigt() {
        System.out.println(this.porteur.nom + " redevient visible.");
    }
}