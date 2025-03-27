package td3;

// une capitale est une ville qui indique le pays ou  elle est située

// on définit 3 constructeurs :
    // - un cosntructeur par defautl
    // - un cosntructeur qui init le nom et le pays
    // - un constructeur qui init le nom, le pays et le nb  d'hab

// question : L'appele a un constructeur de la classe ville est il necessaire dans chacun des trois constructeurs de la calsse capitale


public class Capitale extends Ville {
    private String pays;


    // les constructeurs

    public Capitale() {
        super();
        this.pays = "dafault";
    }

    public Capitale(String nom, String pays) {
        super(nom);
        this.pays = pays;
    }

    public Capitale(String nom, String pays, int nbHab) {
        super(nom, nbHab);
        this.pays = pays;
    }



    // les methodes
    @Override
    public String toString() {
        return super.toString() + " Elle est située en " + this.pays + ".";
    }

    public String getPays() {
        return this.pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }




    public static void main(String[] args) {
        // les tests
        Capitale c1 = new Capitale();
        Capitale c2 = new Capitale("Paris", "France");
        Capitale c3 = new Capitale("Marseille", "France", 1000000);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
}
