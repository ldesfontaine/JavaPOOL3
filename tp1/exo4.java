package tp1;
import java.util.Random;

public class exo4 {

        private final char[] brinPrinc = {'A', 'C', 'G', 'T', 'A', 'C'};
        private final Random random = new Random();

        public void afficherBrin() {
            for (char nucleotide : brinPrinc) {
                System.out.print(nucleotide + " ");
            }
            System.out.println();
        }

        public char[] creerBrinDup() {
            char[] brinDup = new char[brinPrinc.length];
            for (int i = 0; i < brinPrinc.length; i++) {
                switch (brinPrinc[i]) {
                    case 'A':
                        brinDup[i] = 'T';
                        break;
                    case 'T':
                        brinDup[i] = 'A';
                        break;
                    case 'C':
                        brinDup[i] = 'G';
                        break;
                    case 'G':
                        brinDup[i] = 'C';
                        break;
                }
            }
            return brinDup;
        }

        public char[] creerBrinAleatoire() {
            char[] brinAleatoire = new char[brinPrinc.length];
            char[] nucleotides = {'A', 'C', 'G', 'T'};
            for (int i = 0; i < brinAleatoire.length; i++) {
                brinAleatoire[i] = nucleotides[random.nextInt(nucleotides.length)];
            }
            return brinAleatoire;
        }

        public void mutation() {
            int position = random.nextInt(brinPrinc.length);
            char[] nucleotides = {'A', 'C', 'G', 'T'};
            char newNucleotide;
            do {
                newNucleotide = nucleotides[random.nextInt(nucleotides.length)];
            } while (newNucleotide == brinPrinc[position]);
            brinPrinc[position] = newNucleotide;
        }

        public char[] recombinaison(char[] brinAleatoire) {
            int position = random.nextInt(brinPrinc.length);
            char[] brinRecombine = new char[brinPrinc.length];
            for (int i = 0; i < position; i++) {
                brinRecombine[i] = brinAleatoire[i];
            }
            for (int i = position; i < brinPrinc.length; i++) {
                brinRecombine[i] = brinPrinc[i];
            }
            return brinRecombine;
        }

        public char[] complementInverse(char[] brinAleatoire) {
            char[] brinComplement = new char[brinAleatoire.length];
            for (int i = 0; i < brinAleatoire.length; i++) {
                brinComplement[i] = brinAleatoire[brinAleatoire.length - 1 - i];
            }
            return brinComplement;
        }

        public char[] cloneMultiple() {
            int n = random.nextInt(5) + 1;
            char[] brinClone = new char[brinPrinc.length * n];
            for (int i = 0; i < n; i++) {
                System.arraycopy(brinPrinc, 0, brinClone, i * brinPrinc.length, brinPrinc.length);
            }
            return brinClone;
        }

        public static void main(String[] args) {
            exo4 exo = new exo4();
            exo.afficherBrin();

            char[] brinDup = exo.creerBrinDup();
            System.out.println("Brin dupliqué : " + new String(brinDup));

            char[] brinAleatoire = exo.creerBrinAleatoire();
            System.out.println("Brin aléatoire : " + new String(brinAleatoire));

            exo.mutation();
            System.out.println("Brin après mutation : " + new String(exo.brinPrinc));

            char[] brinRecombine = exo.recombinaison(brinAleatoire);
            System.out.println("Brin recombiné : " + new String(brinRecombine));

            char[] brinComplement = exo.complementInverse(brinAleatoire);
            System.out.println("Brin complément inverse : " + new String(brinComplement));

            char[] brinClone = exo.cloneMultiple();
            System.out.println("Brin clone multiple : " + new String(brinClone));
        }
    }
