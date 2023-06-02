import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           int nombre = secretNumber(scanner);
           System.out.println("Le nombre choisi est : " + nombre);
//        System.out.println("Veuillez saisir la valeur de i :");
//        int i = lire(scanner);
//
//        System.out.println("Veuillez saisir la valeur de j :");
//        int j = lire(scanner);
//
//        System.out.println("Veuillez saisir la valeur de k :");
//        int k = lire(scanner);
//
//        int resultat = subtraction(i, j, k);
//
//        System.out.println("Le résultat de la soustraction est égal à : " + resultat);
//
//        System.out.println("Le prix TTC est égal à : " + Math.round(calculTtc(lire(scanner),
//                lire(scanner), lire(scanner)) * 100.0) / 100.0 + " €");
        // aficher l'heure dans la console
         System.out.println("Veuillez saisir l'heure :");
         int heure = scanner.nextInt();

         System.out.println("Veuillez saisir les minutes :");
         int minutes = scanner.nextInt();

         String heurePlusUneMinute = heure(heure, minutes);
         
        System.out.println("Dans une minute, il sera " + heurePlusUneMinute + ".");
        System.out.println("Veuillez saisir l'âge de l'enfant :");
        int age = scanner.nextInt();

        String categorie = categorie(age);

        System.out.println("La catégorie de l'enfant est : " + categorie);
    }

    public static int subtraction(int i, int j, int k) {
        return i - j - k;
    }

    public static int lire(Scanner scanner) {
        System.out.println("Veuillez saisir un nombre : ");
        int nbr = scanner.nextInt();
        return nbr;
    }

    public static float calculTtc(float ht, int qtx, int tva) {
        return ht * qtx * ((tva / 100.0f) + 1);
    }
    public static String categorie(int age) {
        if (age >= 6 && age <= 7) {
            return "Poussin";
        } else if (age >= 8 && age <= 9) {
            return "Pupille";
        } else if (age >= 10 && age <= 11) {
            return "Minime";
        } else if (age >= 12) {
            return "Cadet";
        } else {
            return "Âge non valide !!";
        }
    }

   public static String heure(int heure, int minutes) {
           minutes++; //j'ajouter +1 à chaque fois

           if (minutes >= 60) {
               heure++;
               minutes = 0; 
           }
        return heure + " heure " + minutes;
    }
    public static int secretNumber(Scanner scanner) {
           int nombre;
   
           System.out.println("Veuillez saisir un nombre entre 1 et 3 : ");
           nombre = scanner.nextInt();
   
           while (nombre < 1 || nombre > 3) {
               System.out.println("Nombre invalide. Veuillez saisir un nombre entre 1 et 3 : ");
               nombre = scanner.nextInt();
           }

           return nombre;
}
}