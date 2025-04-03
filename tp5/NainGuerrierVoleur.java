package tp5;

public class NainGuerrierVoleur extends NainGuerrier implements Voleur {
    private int dexterite;

    public NainGuerrierVoleur(String n, int x, int y, int force, int dexterite) {
        super(n, x, y, force);
        this.dexterite = dexterite;
    }

    @Override
    public int getDexterote() {
        return this.dexterite;
    }

    @Override
    public void voler(Personnage p) {
        int sousVoles = Math.min(p.getSous(), this.dexterite);
        p.setSous(p.getSous() - sousVoles);
        this.setSous(this.getSous() + sousVoles);
    }
}
