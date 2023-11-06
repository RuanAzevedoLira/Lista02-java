import java.util.*;

/*Leia um vetor de 10 números inteiros. Em seguida, exiba-os em ordem numérica 
decrescente. Faça o mesmo para um vetor de 10 nomes. */

import java.util.Scanner;

public class OrdenacaoDecrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Vetor de 10 números inteiros
        int[] numeros = new int[10];

        System.out.println("Digite 10 números inteiros:");

        // Lê os números
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Ordena os números em ordem decrescente usando o algoritmo de ordenação de bolha
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Números em ordem decrescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // Vetor de 10 nomes
        String[] nomes = new String[10];

        System.out.println("Digite 10 nomes:");

        // Lê os nomes
        for (int i = 0; i < 10; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.next();
        }

        // Ordena os nomes em ordem alfabética decrescente usando o algoritmo de ordenação de bolha
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (nomes[j].compareTo(nomes[j + 1]) < 0) {
                    String temp = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = temp;
                }
            }
        }

        System.out.println("Nomes em ordem alfabética decrescente:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
