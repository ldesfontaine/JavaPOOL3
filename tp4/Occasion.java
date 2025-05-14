package tp4;

/** Classe représentant une voiture d'occasion */
class Occasion extends Voiture {
    private int nbKms;
    private int age; // en années

    public Occasion(String numero, double prix, int nbKms, int age) {
        super(numero, prix);
        this.nbKms = nbKms;
        this.age = age;
    }

    public int getNbKms() {
        return nbKms;
    }

    public int getAge() {
        return age;
    }

    @Override
    public double getPrix() {
        int kmNormal = age * 20000;
        double ecart = kmNormal - nbKms;
        return prix + (ecart * 6);
    }

    @Override
    public String toString() {
        return "Occasion " + numero + " - Base: " + prix + " CHF, "
                + nbKms + " km, " + age + " ans -> Prix ajusté: " + getPrix() + " CHF";
    }
}