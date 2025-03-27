package tp4;


public class LignePolygonale {
    private final exo1.Point[] sommets;

    public LignePolygonale(int taille) {
        this.sommets = new exo1.Point[taille];
    }

    public LignePolygonale(exo1.Point[] sommets) {
        this.sommets = sommets;
    }

    public exo1.Point getSommet(int index) {
        return this.sommets[index];
    }

    public void setSommet(int index, exo1.Point p) {
        this.sommets[index] = p;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.sommets.length; i++) {
            sb.append("(").append(this.sommets[i].x).append(",").append(this.sommets[i].y).append(")");
            if (i < this.sommets.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void translater(int dx, int dy) {
        for (exo1.Point sommet : this.sommets) {
            sommet.x += dx;
            sommet.y += dy;
        }
    }


    public double longueur() {
        double longueur = 0;
        for (int i = 0; i < this.sommets.length - 1; i++) {
            longueur += this.sommets[i].distanceA(this.sommets[i + 1]);
        }
        return longueur;
    }

    public boolean estFermee() {
        return this.sommets[0].equals(this.sommets[this.sommets.length - 1]);
    }

    // les tests
    public static void main(String[] args) {
        exo1.Point p1 = new exo1.Point(1, 2);
        exo1.Point p2 = new exo1.Point(3, 4);
        exo1.Point p3 = new exo1.Point(5, 6);
        exo1.Point p4 = new exo1.Point(1, 2);

        LignePolygonale lp1 = new LignePolygonale(3);
        lp1.setSommet(0, p1);
        lp1.setSommet(1, p2);
        lp1.setSommet(2, p3);

        LignePolygonale lp2 = new LignePolygonale(new exo1.Point[]{p1, p2, p3});

        System.out.println(lp1.toString());
        System.out.println(lp2.toString());

        System.out.println(lp1.longueur());
        System.out.println(lp2.longueur());

        System.out.println(lp1.estFermee());
        System.out.println(lp2.estFermee());

        lp1.translater(1, 1);
        System.out.println(lp1.toString());

    }
}
