package tp4;

/** Classe de base abstraite pour toutes les voitures */
abstract class Voiture {
    protected String numero;
    protected double prix;

    public Voiture(String numero, double prix) {
        this.numero = numero;
        this.prix = prix;
    }

    public String getNumero() {
        return numero;
    }

    public abstract double getPrix();
}