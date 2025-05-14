package tp4;

/** Classe représentant une option pour les voitures neuves */
public class Option {
    private String numero;
    private String libelle;
    private double prix;

    public Option(String numero, String libelle, double prix) {
        this.numero = numero;
        this.libelle = libelle;
        this.prix = prix;
    }

    public String getNumero() {
        return numero;
    }

    public String getLibelle() {
        return libelle;
    }

    public double getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return libelle + " (" + numero + ") : " + prix + " CHF";
    }
}
