package tp5;

public abstract class Anneau {
    protected String nom;
    protected Personnage porteur;

    public Anneau(String nom, Personnage porteur) {
        this.nom = nom;
        this.porteur = porteur;
    }

    public String getNom() {
        return this.nom;
    }

    public Personnage getPorteur() {
        return this.porteur;
    }

    public abstract void passerAuDoigt();

    public abstract void enleverDuDoigt();
}

