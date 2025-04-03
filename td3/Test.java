package td3;

public class Test {
//    Définir une classe Test qui permette de tester la classe Ville.

    public static void main(String[] args) {
        // Création d'objets Ville
        Ville v1 = new Ville();
        Ville v2 = new Ville("Paris");
        Ville v3 = new Ville("Marseille", 1000000);

        // Affichage des informations des villes
        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());


        // Modification du nombre d'habitants de la ville v2
        modifierNbHab(v2, 2000000);
    }

    public static void modifierNbHab(Ville ville, int nbHab) {
        ville.setNbHab(nbHab);
        System.out.println("Après modification : " + ville.toString());
    }
}
