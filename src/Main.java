import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(("Digite um número: "));
            vetor[i] = sc.nextInt();
        }
        System.out.println();
        int pares = 0;
        System.out.println("NÚMEROS PARES: ");
        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + " ");
                pares++;
            }
        }
        System.out.println();
        System.out.println("QUANTIDADE DE PARES: " + pares);
    }
}