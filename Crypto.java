import java.util.Scanner;

public class Crypto {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int DECALAGE = 4;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Veuillez entrer une chaine de caracteres : ");
        String s = scanner.nextLine();

        // la chaine a coder
        String aCoder = "";
        // la chaine codee
        String chaineCodee = "";

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

        aCoder = s.replaceAll("[\\,.\'-;:\"()ç%&=+1234567890^*#/<>!?$¨°éèàöäüù{}ABCDEFGHIJKLMNOPQRSTUVWXYZ]", "");


        int aCoderLongueur = aCoder.length();
        char[] tabACoder = aCoder.toCharArray();
        int ALPHABETLongueur = ALPHABET.length();
        String ALPHABETDouble = ALPHABET + ALPHABET;
        char[] tabALPHABETDouble = ALPHABETDouble.toCharArray();

        for (int i = 0; i < aCoderLongueur; i++)
        {
            int j = 0;
            while (tabACoder[i] != ' ' && tabACoder[i] != tabALPHABETDouble[j] && j < ALPHABETLongueur)
            {
                j++;
            }
            if (tabACoder[i] == ' ')
                tabACoder[i] = ' ';
            else
             tabACoder[i] = tabALPHABETDouble[j + DECALAGE];
        }

        for (int n = 0; n < aCoderLongueur; n++)
        {
            chaineCodee += tabACoder[n];
        }

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        System.out.format("La chaine initiale etait : '%s'\n", s);

        if (aCoder.isEmpty()) {
            System.out.println("La chaine a coder est vide.\n");
        } else {
            System.out.format("La chaine a coder est : '%s'\n", aCoder);
            System.out.format("La chaine codee est : '%s'\n", chaineCodee);
        }
    }
}