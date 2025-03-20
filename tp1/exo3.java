package tp1;

public class exo3 {

    public int[] remplirUnTableau() {
        return new int[]{2,5,1,4,6,4,1,1,1};
    }

    public void afficherUnTableau(int[] tableau) {
        for (int i : tableau) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public int sommeDesElements(int[] tableau) {
        int somme = 0;
        for (int i : tableau) {
            somme += i;
        }
        return somme;
    }

    public int moyenneDesElements(int[] tableau) {
        return sommeDesElements(tableau) / tableau.length;
    }

    public double ecartTypeDesElements(int[] tableau) {
        double moyenne = moyenneDesElements(tableau);
        double somme = 0;
        for (int i : tableau) {
            somme += Math.pow(i - moyenne, 2);
        }
        return Math.sqrt(somme / tableau.length);
    }

    public int minimumDuTableau(int[] tableau) {
        int min = tableau[0];
        for (int i : tableau) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }


    public int maximumDuTableau(int[] tableau) {
        int max = tableau[0];
        for (int i : tableau) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public int positionDElement(int[] tableau, int element) {
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == element) {
                return i;
            }
        }
        return -1;
    }

public void distributionDesValeurs(int[] tableau) { // TODO PAS SUR DE SAVOIR CE QUI FAUT VRM FAIRE
        int[] distribution = new int[10];
        for (int i : tableau) {
            distribution[i]++;
        }
        for (int i = 0; i < distribution.length; i++) {
            System.out.println(i + " : " + distribution[i]);
        }
    }
public void diagrammeBaton(int[] tableau) {
        int[] distribution = new int[10];
        for (int i : tableau) {
            distribution[i]++;
        }
        for (int i = 0; i < distribution.length; i++) {
            System.out.print(i + " : ");
            for (int j = 0; j < distribution[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        exo3 exo3 = new exo3();
        int[] tableau = exo3.remplirUnTableau();
        exo3.afficherUnTableau(tableau);
        System.out.println("Somme des éléments : " + exo3.sommeDesElements(tableau));
        System.out.println("Moyenne des éléments : " + exo3.moyenneDesElements(tableau));
        System.out.println("Ecart-type des éléments : " + exo3.ecartTypeDesElements(tableau));
        System.out.println("Minimum du tableau : " + exo3.minimumDuTableau(tableau));
        System.out.println("Maximum du tableau : " + exo3.maximumDuTableau(tableau));
        System.out.println("Position de l'élément 4 : " + exo3.positionDElement(tableau, 4));
        exo3.distributionDesValeurs(tableau);
        System.out.println("----------------------");
        exo3.diagrammeBaton(tableau);
    }

}



