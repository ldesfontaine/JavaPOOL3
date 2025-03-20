package tp1;

public class exo1 {
    public static void main(String[] args) {
        double u = 1.0/3;
        System.out.println("u0 = " + u);
        for (int i = 1; i <= 50; i++) {
            u = 7 * u - 2;
            System.out.println("u" + i + " = " + u);
        }
    }
}
