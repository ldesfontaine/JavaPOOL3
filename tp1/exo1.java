package tp1;

public class exo1 {
//    Exercice 1
//    Soit la suite (𝑢𝑛
//                   )𝑛∈ℕ définie par : 𝑢0 =
//            1
//            3
//    et pour tout 𝑛 ∈ ℕ , 𝑢𝑛+1 = 7𝑢𝑛 − 2.
//    a) Montrer par récurrence que pour tout 𝑛 ∈ ℕ, 𝑢𝑛 =
//            1
//            3
//            .
//    b) Ecrire une classe Java qui affiche les 30 premiers termes de cette suite. Que remarquezvous ? Expliquez.

    public static void main(String[] args) {
        double u = 1.0/3;
        System.out.println("u0 = " + u);
        for (int i = 1; i <= 50; i++) {
            u = 7 * u - 2;
            System.out.println("u" + i + " = " + u);
        }
    }
//    a) On remarque que :
}
