package tp5;

public abstract class Personnage {
    protected String nom;
    protected int pointsVie, connaissances, x, y, v;
    private int sous;
    private Anneau anneau;

    public Personnage(String n, int x, int y, int v) {
        this.nom = n;
        this.x = x;
        this.y = y;
        this.pointsVie = 100;
        this.connaissances = 0;
        this.v = v;
        this.sous = 0;
        this.anneau = null;
    }

    public int getSous() {
        return this.sous;
    }

    public void setSous(int s) {
        this.sous = s;
    }

    public int getPointsVie() {
        return this.pointsVie;
    }

    public void setPointsVie(int pv) {
        this.pointsVie = pv;
    }

    public int getConnaissances() {
        return this.connaissances;
    }

    public void setConnaissances(int co) {
        this.connaissances = co;
    }

    public void seDeplacer(int dx, int dy, int t) {
        this.x = (int) (this.x + dx * this.v * t / Math.sqrt(dx * dx + dy * dy));
        this.y = (int) (this.y + dy * this.v * t / Math.sqrt(dx * dx + dy * dy));
    }

    public abstract String parler();

    public void mettreAnneau(Anneau a) {
        this.anneau = a;
    }

    public void enleverAnneau() {
        this.anneau = null;
    }

    public Anneau getAnneau() {
        return this.anneau;
    }
}

