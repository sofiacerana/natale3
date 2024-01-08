import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Inizializzo l'array con 10 numeri tra graffe
        int[] a = {1, 4, -3, 21, 7, -1, 0, 11, 8, 5};

        // Chiedo di inserire un numero
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int n = scanner.nextInt();

        // Cerco nell'array
        boolean trovato = cercaN(a, n);

        // Stampo il risultato
        if (trovato==true) {
            System.out.println("Numero trovato!");
        } else {
            System.out.println("Numero non trovato!");

            int[] a1 = new int[a.length + 1];
            System.arraycopy(a, 0, a1, 0, a.length);

            a1[a.length] = n;

            System.out.println("Array con numero in più:");
            for (int num : a1) {
                System.out.print(num + " ");
            }
        }
    }

    // Cerco il numero
    public static boolean cercaN(int[] array, int n) {
        boolean risultato=true;
        for (int num : array) {
            if (num == n) {
                risultato=true;
            }
            risultato=false;
        }
        return risultato;
    }
}
