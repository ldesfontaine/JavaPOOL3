package td3;

public class Ville {
    private final String nom;
    private int nbHab;

    // les constructeurs

    public Ville() {
        this.nom = "dafault";
        this.nbHab = 0;
    }

    public Ville(String nom) {
        this.nom = nom.toUpperCase();
        this.nbHab = 0;
    }

    public Ville(String nom, int nbHab) {
        this.nom = nom.toUpperCase();
        this.nbHab = nbHab;
    }



    // les methodes

    @Override
    public String toString() {
        return "La ville de " + this.nom + " a " + this.nbHab + " habitants.";
    }

    public void setNbHab(int nbHab) {
        if (nbHab > 0) {
            this.nbHab = nbHab;
        }
    }

    public int getNbHab() {
        return this.nbHab;
    }

    public String getNom() {
        return this.nom;
    }





    public static void main(String[] args) {
        // les tests
        Ville v1 = new Ville();
        Ville v2 = new Ville("Paris");
        Ville v3 = new Ville("Marseille", 1000000);

        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());
    }
}