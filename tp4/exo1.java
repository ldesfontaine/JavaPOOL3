package tp4;

import tp2.exo2;
// https://github.com/ldesfontaine/JavaPOOL3
// TP2 - Exercice 2 modifié donc il faut le récupérer ici
public class exo1 {

    public static class Point extends exo2.Point {
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double distanceA(Point p) {
            return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
        }

        public boolean equals(Point p) {
            return this.x == p.x && this.y == p.y;
        }
    }

    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        System.out.println(p1.distanceA(p2));
        System.out.println(p1.equals(p2));

        Point p3 = new Point(1, 2);
        System.out.println(p1.equals(p3));

    }

}