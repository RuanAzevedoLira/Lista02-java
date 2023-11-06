import java.util.*;

/*Leia um vetor de 10 números inteiros. Exiba este vetor acompanhado do seu 
elemento simétrico em relação a sua posição no conjunto. Veja o exemplo:
Entrada: [5, 7, 9, 2]
Saída: [5 – 2, 7 – 9, 9 – 7, 2 – 5]*/

import java.util.Scanner;

public class VetorSimetrico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        System.out.println("Digite 10 números inteiros:");

        // Lê os números inteiros e os armazena no vetor
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.print("Saída: [");

        // Exibe os elementos e seus elementos simétricos
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " - " + vetor[9 - i]);

            // Adiciona uma vírgula se não for o último elemento
            if (i < 9) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        scanner.close();
    }
}


