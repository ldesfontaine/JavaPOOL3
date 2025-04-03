package tp5;

public class Nain extends Personnage {
    public Nain(String n, int x, int y) {
        super(n, x, y, 2);
    }

    @Override
    public String parler() {
        return "Groumpf";
    }
}


