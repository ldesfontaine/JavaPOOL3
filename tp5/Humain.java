package tp5;

public class Humain extends Personnage {
    public Humain(String n, int x, int y) {
        super(n, x, y, 5);
    }

    @Override
    public String parler() {
        return "Bonjour";
    }
}

