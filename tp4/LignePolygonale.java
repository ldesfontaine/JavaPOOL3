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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.sommets.length; i++) {
            sb.append(this.sommets[i].toString());
            if (i < this.sommets.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void translater(int dx, int dy) {
        for (int i = 0; i < this.sommets.length; i++) {
            this.sommets[i].x += dx;
            this.sommets[i].y += dy;
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
}
