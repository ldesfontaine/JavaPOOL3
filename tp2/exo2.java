package tp2;

/*
Dans le plan, un point est représenté par ses coordonnées : x = abscisse, y = ordonnée.
Ecrire une classe Point qui contienne :
    - un constructeur
    - une méthode permettant de translater un point d’une valeur dx en x et dy en y
    - une méthode toString permettant d’afficher les coordonnés d’un point sous la forme (x, y)
    - une méthode main permettant de tester les ressources de la classe Point.
    N.B. : Les attributs d’un point seront définis comme étant privés.
 */


public class exo2 {

    //    create class Point
    public static class Point {
        private double x;
        private double y;


        public void translation(double dx, double dy) {
            this.x += dx;
            this.y += dy;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        public  static void main(String[] args) {
            Point p = new Point();
            p.x = 5;
            p.y = 10;
            System.out.println(p);
            p.translation(2, 3);
            System.out.println(p);
        }
    }


}



