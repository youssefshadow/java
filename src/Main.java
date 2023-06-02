import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez saisir  la valeur de i :");
        int i = scanner.nextInt();

        System.out.println("Veuillez saisir  la valeur de j :");
        int j = scanner.nextInt();

        System.out.println("Veuillez saisir  la valeur de k :");
        int k = scanner.nextInt();

        int resultat = subtraction(i, j, k);

        System.out.println("Le résultat de la soustraction est égal à : " + resultat);
    }




    public static int subtraction(int i, int j, int k) {
        return i - j - k;
    }

    public static void intervertir(int i, int j){
        int change = i;
        i = j;
        j = change;
    }
}
