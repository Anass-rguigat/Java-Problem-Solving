
import java.util.Scanner;
import java.util.ArrayList;

class Delta {
    public static void main(String[] args) {
        double a, b, c;
        Scanner clavier = new Scanner(System.in);
        int repete;
        ArrayList<double[]> historique = new ArrayList<>();

        do {
            System.out.println("Entrez la valeur a");
            a = clavier.nextDouble();
            System.out.println("Entrez la valeur b");
            b = clavier.nextDouble();
            System.out.println("Entrez la valeur c");
            c = clavier.nextDouble();
            double delta = b * b - (4 * a * c);

            if (delta > 0) {
                double res1 = (-b + Math.sqrt(delta)) / (2 * a);
                double res2 = (-b - Math.sqrt(delta)) / (2 * a);
                historique.add(new double[]{a, b, c, res1, res2});
                System.out.println("resultats : " + res1 + " " + res2);
            } else if (delta == 0) {
                double res = -b / (2 * a);
                historique.add(new double[]{a, b, c, res});
                System.out.println("resultats : " + res);
            } else {
                historique.add(new double[]{a, b, c});
                System.out.println("Pas resultat");
            }

            System.out.println("tu veux répéter ? Si oui, entrez 1 sinon non entrez 2 ");
            repete = clavier.nextInt();
        } while (repete == 1);

        System.out.println("tu veux voir l'historique ? Si oui, entrez 1 sinon entrez 2");
        int res = clavier.nextInt();

        if (res == 1) {
            for (int i = 0; i < historique.size(); i++) {
                double[] instruction = historique.get(i);
                System.out.println("Instruction " + (i + 1) + ":");
                System.out.println("a = " + instruction[0] + ", b = " + instruction[1] + ", c = " + instruction[2]);

                if (instruction.length == 3) {
                    System.out.println("Pas de résultats");
                } else if (instruction.length == 4) {
                    System.out.println("Résultat : x1 = " + instruction[3]);
                } else {
                    System.out.println("Résultat : x1 = " + instruction[3] + ", x2 = " + instruction[4]);
                }

                System.out.println("----------------------------------");
            }
        }
    }
}
