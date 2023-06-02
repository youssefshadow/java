import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir la valeur de i :");
        int i = scanner.nextInt();

        System.out.println("Veuillez saisir la valeur de j :");
        int j = scanner.nextInt();

        System.out.println("Veuillez saisir la valeur de k :");
        int k = scanner.nextInt();

        int resultat = subtraction(i, j, k);

        System.out.println("Le résultat de la soustraction est égal à : " + resultat);

        System.out.println("Veuillez saisir le prix hors taxe :");
        double montantHT = scanner.nextDouble();

        System.out.println("Veuillez saisir le taux de TVA :");
        double tauxTVA = scanner.nextDouble();

        System.out.println("put the quantities  :");
        int quantite = scanner.nextInt();

        double calcul = calculerPrixTTC(montantHT, quantite, tauxTVA);
        System.out.println("Le prix TTC est : " + calcul);
    }

    public static int subtraction(int i, int j, int k) {
        return i - j - k;
    }

    public static double calculerPrixTTC(double montantHT, int quantite, double tauxTVA) {
        double montantTVA = montantHT * (tauxTVA / 100);
        double prixTTC = montantHT + montantTVA;
        return prixTTC;
    }
}
