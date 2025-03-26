package tp4;

public class Rectangle implements Forme {
    private exo1.Point p1, p2; // coins opposés

    public Rectangle(exo1.Point p1, exo1.Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double getPerimetre() {
        double largeur = Math.abs(p2.x - p1.x);
        double hauteur = Math.abs(p2.y - p1.y);
        return 2 * (largeur + hauteur);
    }

    public Forme translater(double dx, double dy) {
        exo1.Point np1 = new exo1.Point(p1.x + dx, p1.y + dy);
        exo1.Point np2 = new exo1.Point(p2.x + dx, p2.y + dy);
        return new Rectangle(np1, np2);
    }

    public double getSurface() {
        double largeur = Math.abs(p2.x - p1.x);
        double hauteur = Math.abs(p2.y - p1.y);
        return largeur * hauteur;
    }

    public String toString() {
        return "Rectangle : " + p1.toString() + ", " + p2.toString();
    }
}
