package tp5;

public class Hobbit extends Personnage {
    public Hobbit(String n, int x, int y) {
        super(n, x, y, 5);
    }

    @Override
    public String parler() {
        return "Belle journée ma foi";
    }

    public static void main(String[] args) {
        Hobbit frodon = new Hobbit("Frodon", 200, 100);
        AnneauDeSauron anneauDeSauron = AnneauDeSauron.getInstance(frodon);
        frodon.mettreAnneau(anneauDeSauron);
        anneauDeSauron.passerAuDoigt();
        anneauDeSauron.enleverDuDoigt();
    }
}

