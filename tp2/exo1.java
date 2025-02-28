package tp2;

public class exo1 {

    public static void main(String[] args) {
        //a) Demander la saisie d’une phrase.
        String phrase = "Bonjour, comment ça va ?";
        //b) Afficher la phrase en majuscules.
        System.out.println(phrase.toUpperCase());
        //c) Compter le nombre de a dans la phrase puis, s'il y en a, transformer tous les a en *.
        int count = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == 'a') {
                count++;
            }
        }
        if (count > 0) {
            phrase = phrase.replace('a', '*');
        }
        System.out.println(phrase);
    }

}
