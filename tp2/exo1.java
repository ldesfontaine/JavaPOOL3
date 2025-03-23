package tp2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class exo1 {

/*
1) En utilisant des méthodes de la classe String de Java, écrire un programme qui réalise les
opérations suivantes :
a) Demander la saisie d’une phrase.
test.b) Afficher la phrase en majuscules.
test.c) Compter le nombre de a dans la phrase puis, s'il y en a, transformer tous les a en *.
*/

    public void part1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une phrase:");
        String phrase = scanner.nextLine();

        System.out.println(phrase.toUpperCase());

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
    /*
    2) Écrire un programme qui permet d’obtenir les actions suivantes :
    a) Saisir des mots jusqu'à ce que l’utilisateur entre le mot « Fin ».
    test.b) Afficher, parmi les mots saisis, le premier dans l’ordre alphabétique.
    test.c) Afficher, parmi les mots saisis, le dernier dans l'ordre alphabétique.
    N.B. : Le mot « Fin » ne doit pas être pris en compte dans la liste des mots saisis.
     */
    public void part2(){
        Scanner Scanner = new Scanner(System.in);
        String mot = "";
        ArrayList<String> mots = new ArrayList<>();

        // pas d'uppercase donc il faut écrire exactement Fin et non fin ou FIN
        while (!Objects.equals(mot, "Fin")){
            System.out.println("Entrer un mot : ");
            mot = Scanner.nextLine();
            if (Objects.equals(mot, "Fin")){
                break;
            }
            mots.add(mot);
        }
        Collections.sort(mots);
        System.out.println("Premier mot dans l'ordre alphabétique : " + mots.get(0));
        System.out.println("Dernier mot dans l'ordre alphabétique : " + mots.get(mots.size() - 1));
    }

    public static void main(String[] args) {
        System.out.println("Partie 1 ou Partie 2 ? ");
        Scanner scanner = new Scanner(System.in);
        int choix = scanner.nextInt();
        scanner.nextLine();
        exo1 exo = new exo1();
        if (choix == 1){
            exo.part1();
        } else if (choix == 2){
            exo.part2();
        } else {
            System.out.println("Choix invalide");
        }
        scanner.close();
    }

}

