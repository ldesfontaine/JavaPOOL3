package tp5;

public class NainGuerrier extends Nain implements Guerrier {
    private int force;

    public NainGuerrier(String n, int x, int y, int force) {
        super(n, x, y);
        this.force = force;
    }

    @Override
    public int getForce() {
        return this.force;
    }

    @Override
    public void attaquer(Personnage p) {
        p.setPointsVie(p.getPointsVie() - this.force);
    }
}

