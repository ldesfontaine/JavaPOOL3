package tp4;

public interface Forme {
    double getPerimetre();

    Forme translater(double dx, double dy);  // doit retourner une nouvelle instance translatée

    double getSurface();
}
