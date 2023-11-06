import java.util.*;

/*Leia dois vetores de números inteiros com a mesma quantidade. Exiba a intersecção 
dos vetores, ou seja, os números que são repetidos nos dois vetores. */

import java.util.Scanner;
import java.util.ArrayList;

public class IntersecaoDeVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a quantidade de elementos nos vetores
        System.out.print("Informe a quantidade de elementos nos vetores: ");
        int quantidade = scanner.nextInt();

        int[] vetor1 = new int[quantidade];
        int[] vetor2 = new int[quantidade];

        // Lê os elementos do primeiro vetor
        System.out.println("Informe os elementos do primeiro vetor:");
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

        // Lê os elementos do segundo vetor
        System.out.println("Informe os elementos do segundo vetor:");
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }

        // Encontra a interseção dos vetores
        ArrayList<Integer> intersecao = new ArrayList<Integer>();

        for (int i = 0; i < quantidade; i++) {
            for (int j = 0; j < quantidade; j++) {
                if (vetor1[i] == vetor2[j] && !intersecao.contains(vetor1[i])) {
                    intersecao.add(vetor1[i]);
                }
            }
        }

        // Exibe a interseção dos vetores
        if (intersecao.isEmpty()) {
            System.out.println("Não há elementos em comum nos dois vetores.");
        } else {
            System.out.print("Interseção dos vetores: ");
            for (int elemento : intersecao) {
                System.out.print(elemento + " ");
            }
        }

        scanner.close();
    }
}
