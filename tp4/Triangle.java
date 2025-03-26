package tp4;

public class Triangle implements Forme {
    private exo1.Point p1, p2, p3;

    public Triangle(exo1.Point p1, exo1.Point p2, exo1.Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getPerimetre() {
        return p1.distanceA(p2) + p2.distanceA(p3) + p3.distanceA(p1);
    }

    public Forme translater(double dx, double dy) {
        exo1.Point np1 = new exo1.Point(p1.x + dx, p1.y + dy);
        exo1.Point np2 = new exo1.Point(p2.x + dx, p2.y + dy);
        exo1.Point np3 = new exo1.Point(p3.x + dx, p3.y + dy);
        return new Triangle(np1, np2, np3);
    }

    public double getSurface() {  // Formule de Héron
        double a = p1.distanceA(p2);
        double b = p2.distanceA(p3);
        double c = p3.distanceA(p1);
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public String toString() {
        return "Triangle : " + p1.toString() + ", " + p2.toString() + ", " + p3.toString();
    }
}
