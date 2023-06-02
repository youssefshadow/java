public class Main {
    public static void main(String[] args) {
        System.out.println("Le résultat de la soustraction est égal à : " + subtraction(52, 14, 8));
        //int a = 10;
        //int b = 15;
        intervertir(10,5);


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
