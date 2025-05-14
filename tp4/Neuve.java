package tp4;

import java.util.ArrayList;
import java.util.List;

/** Classe représentant une voiture neuve avec des options */
class Neuve extends Voiture {
    private List<Option> options;

    public Neuve(String numero, double prixBase) {
        super(numero, prixBase);
        this.options = new ArrayList<>();
    }

    public void ajouterOption(Option opt) {
        options.add(opt);
    }

    @Override
    public double getPrix() {
        double total = prix;
        for (Option opt : options) {
            total += opt.getPrix();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Neuve ").append(numero)
                .append(" - Prix de base: ").append(prix)
                .append(" CHF, Options: [");
        for (int i = 0; i < options.size(); i++) {
            sb.append(options.get(i).getLibelle());
            if (i < options.size() - 1) sb.append(", ");
        }
        sb.append("] -> Prix total: ").append(getPrix()).append(" CHF");
        return sb.toString();
    }
}