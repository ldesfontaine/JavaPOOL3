package tp1;

public class exo2 {
    public void part1(int N){
        double pi = 0;
        for (int i = 0; i < N; i++) {
            pi += Math.pow(-1, i) / (2 * i + 1);
        }
        pi *= 4;
        System.out.println("pi = " + pi);
    }


    public void part2(double epsilon){
        double pi = 0;
        double pi_prec = 0;
        int i = 0;
        do {
            pi_prec = pi;
            pi += Math.pow(-1, i) / (2 * i + 1);
            i++;
        } while (Math.abs(pi - pi_prec) > epsilon);
        pi *= 4;
        System.out.println("pi = " + pi);
        System.out.println("Nombre d'itérations = " + i);
    }

    public static void main(String[] args) {
        exo2 exo = new exo2();
        exo.part1(1000000);
        exo.part2(1e-2);
        exo.part2(1e-6);
    }

}
