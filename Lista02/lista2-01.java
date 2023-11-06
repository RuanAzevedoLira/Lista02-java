import java.util.*;

/*Leia um vetor de notas, em que a quantidade é especificada pelo usuário. Em 
seguida, calcule a média das notas digitadas. Finamente, exiba o conjunto das notas 
maiores do que a média calculada, bem como e conjunto de notas menores do que 
a média. OBS: Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada 
nota.*/ 

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a quantidade de notas ao usuário
        System.out.print("Informe a quantidade de notas: ");
        int quantidade = scanner.nextInt();

        // Verifica se a quantidade é válida
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida. O programa será encerrado.");
            return;
        }

        double[] notas = new double[quantidade];
        double somaNotas = 0;

        // Lê as notas e calcula a média
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            double nota = scanner.nextDouble();

            // Verifica se a nota é válida (entre 0 e 10)
            if (nota >= 0 && nota <= 10) {
                notas[i] = nota;
                somaNotas += nota;
            } else {
                System.out.println("Nota inválida. Informe uma nota entre 0 e 10.");
                i--; // Decrementa o contador para que o usuário insira a nota novamente.
            }
        }

        // Calcula a média das notas
        double media = somaNotas / quantidade;
        System.out.println("Média das notas: " + media);

        // Exibe as notas maiores e menores que a média
        System.out.println("Notas maiores que a média:");
        for (double nota : notas) {
            if (nota > media) {
                System.out.println(nota);
            }
        }

        System.out.println("Notas menores que a média:");
        for (double nota : notas) {
            if (nota < media) {
                System.out.println(nota);
            }
        }

        scanner.close();
    }
}
