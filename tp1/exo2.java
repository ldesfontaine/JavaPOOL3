package tp1;

public class exo2 {
//    Exercice 2//            .
//            Cette formule permet une estimation précise de 𝜋 pour un nombre d’itérations suffisamment grand.
//1) Ecrire une classe Java calculant une valeur estimée de 𝜋 en connaissant le nombre
//    d’itérations 𝑁 à réaliser ; 𝑁 sera déclaré comme une constante dans le programme.

//2) Ecrire une classe Java calculant une valeur estimée de 𝜋 avec une précision 𝜀 donnée. Ce
//    programme affichera l’approximation de 𝜋 obtenue et le nombre d’itérations réalisées.
//    Tester cette classe avec 𝜀 = 10−2 et 𝜀 = 10−6
//            .
//    Indication : Le calcul devra s’arrêter lorsque la valeur absolue de la différence entre la valeur
//    calculée et la valeur précédente devient inférieure à la précision demandée.



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
