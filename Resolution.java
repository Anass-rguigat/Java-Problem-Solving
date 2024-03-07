import java.util.Scanner;

class Resolution{
    public static void main(String[] args){
        double a ,b ,c ;
        Scanner clavier = new Scanner(System.in);
        ArrayList<Double> historique = new ArrayList<Double>();
        do{
        System.out.println("Entrez la valeur a");
        a = clavier.nextDouble();
        System.out.println("Entrez la valeur b");
        b = clavier.nextDouble();
        System.out.println("Entrez la valeur c");
        c = clavier.nextdouble();
        double delta = b * b - (4 * a * c);

        
        if (delta > 0) {
            double res1 = (-b + Math.sqrt(elta)) / (2 * a);
            double res2 = (-b - Math.sqrt(elta)) / (2 * a);
            historique.add(new double[]{a, b, c, res1, res2});   
            System.out.println("resultats : " + res1 + " " + res2);
        } else if (delta == 0) {
            double res = -b / (2 * a);
            historique.add(new double[]{a, b, c, res});   
            System.out.println("resultats : " + res);
        } else {
            historique.add(new double[]{a, b, c,0});   
            System.out.println("Pas resultat");
        }
        System.out.println("tu veut repeter? si oui entrez 1 sinon non entrez 2 ");
        int repete = clavier.nextInt();
        }while( repete == 1)
        System.out.println("tu veux voire historique si oui enter 1 sinon entez 2");
        int res = clavier.nextInt();
        if(res == 1 ){
           for (int i = 0; i < historique.size(); i++) {
            double[] instruction = historique.get(i);
            System.out.println("Instruction " + (i + 1) + ":");
            System.out.println("a = " + instruction[0] + ", b = " + instruction[1] + ", c = " + instruction[2]);
            System.out.println("Résultat : x1 = " + instruction[3] + ", x2 = " + instruction[4]);
             System.out.println("----------------------------------");
        }
        }
        
    }
}