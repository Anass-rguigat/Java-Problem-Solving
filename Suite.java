import java.util.Scanner;

class Suite {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        int debut;
        do {
            System.out.print("de (>= 1) ? ");
            debut = clavier.nextInt();
        } while (debut < 1);

        int fin;
        do {
            System.out.print("a (>= " + debut + ") ? ");
            fin = clavier.nextInt();
        } while (fin < debut);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        
        for (int i = debut; i <= fin; i++) {
            int nombreRepetitions = 0;
            int nombreActuel = i;

            while (nombreActuel != 0) {
                if (nombreActuel % 3 == 0) {
                    nombreActuel += 4;
                } else if (nombreActuel % 4 == 0) {
                    nombreActuel /= 2;
                } else {
                    nombreActuel -= 1;
                }
                nombreRepetitions++;
            }

            System.out.println(i + " -> " + nombreRepetitions);
        }

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}
