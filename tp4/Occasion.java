package tp4;

public class Occasion extends Voiture {
    private int nbKms;
    private int age;

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
        return prix; // Peut être ajusté en fonction de l'âge et du kilométrage
    }
}
