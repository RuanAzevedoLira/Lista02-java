import java.util.*;

/*Leia um vetor de 20 valores inteiros e, em seguida, exiba-os na ordem inversa do 
que foram digitados */

import java.util.Scanner;

public class VetorInverso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[20];

        System.out.println("Digite 20 valores inteiros:");

        // Lê os valores inteiros e os armazena no vetor
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Valores na ordem inversa:");

        // Exibe os valores na ordem inversa
        for (int i = 19; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

        scanner.close();
    }
}
