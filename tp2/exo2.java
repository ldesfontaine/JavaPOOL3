package tp2;


public class exo2 {

    public static class Point {
        protected double x;
        protected double y;


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



