import java.util.*;

/*Leia dois vetores de números inteiros já ordenados de forma crescente. Crie um 
outro vetor para armazenar os dois conjuntos unidos, sendo que os números no outro 
vetor devem permanecer ordenados. Finalmente, exiba este vetor resultante. OBS:
os vetores iniciais podem ter o tamanho diferente */

import java.util.Scanner;

public class UniaoOrdenadaDeVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o tamanho dos dois vetores
        System.out.print("Informe o tamanho do primeiro vetor: ");
        int tamanhoVetor1 = scanner.nextInt();

        System.out.print("Informe o tamanho do segundo vetor: ");
        int tamanhoVetor2 = scanner.nextInt();

        int[] vetor1 = new int[tamanhoVetor1];
        int[] vetor2 = new int[tamanhoVetor2];

        // Lê os elementos do primeiro vetor
        System.out.println("Informe os elementos do primeiro vetor (em ordem crescente):");
        for (int i = 0; i < tamanhoVetor1; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

        // Lê os elementos do segundo vetor
        System.out.println("Informe os elementos do segundo vetor (em ordem crescente):");
        for (int i = 0; i < tamanhoVetor2; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }

        // Unir os dois vetores mantendo a ordenação
        int tamanhoVetorResultado = tamanhoVetor1 + tamanhoVetor2;
        int[] vetorResultado = new int[tamanhoVetorResultado];

        int i = 0, j = 0, k = 0;

        while (i < tamanhoVetor1 && j < tamanhoVetor2) {
            if (vetor1[i] < vetor2[j]) {
                vetorResultado[k++] = vetor1[i++];
            } else {
                vetorResultado[k++] = vetor2[j++];
            }
        }

        while (i < tamanhoVetor1) {
            vetorResultado[k++] = vetor1[i++];
        }

        while (j < tamanhoVetor2) {
            vetorResultado[k++] = vetor2[j++];
        }

        // Exibe o vetor resultante
        System.out.print("Vetor unido e ordenado: [");
        for (int valor : vetorResultado) {
            System.out.print(valor + " ");
        }
        System.out.println("]");

        scanner.close();
    }
}
