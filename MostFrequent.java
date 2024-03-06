class MostFrequent {

    public static void main(String[] args) {
        int[] tab1 = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
        int taille = tab1.length;

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        int frequence = 0,i,j,compteur,valeur=0;
        for ( i = 0 ; i < taille; ++i) {
        	compteur = 0;
        	for (j = 0; j < taille; ++j) {
        		
        		if (tab1[i] == tab1[j]) {
        			compteur+=1;
        		}
        	}
        		if (compteur > frequence) {
        			frequence = compteur;
        			valeur = tab1[i];
        		}
        }
        
        System.out.println("Le nombre le plus frequent dans le tableau est le :\n" + valeur +
        		" (" + frequence + " x)");

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

    }
}