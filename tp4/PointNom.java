package tp4;

public class PointNom extends exo1.Point {
    private final char nom;

    public PointNom(double x, double y, char nom) {
        super(x, y);
        this.nom = nom;
    }

    @Override
    public String toString() {
        return nom + "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object o) { // TODO pas sur de celui la
        if (!(o instanceof PointNom))
            return false;
        PointNom p = (PointNom) o;
        return this.nom == p.nom && super.equals(p);
    }
}
