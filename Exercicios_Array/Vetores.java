package Exercicios_Array;

import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numeros = new int[10];
        int soma = 0;
        double media = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número inteiro: ");
            numeros[i] = input.nextInt();

            soma += numeros[i];
        }

        System.out.println("Elementos dos índices ímpares do vetor: ");

        for (int i = 1; i < numeros.length; i += 2) {
            System.out.print(numeros[i]+ " ");
        }

        System.out.println("\nElementos pares do vetor: ");

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i]+ " ");
            }
        }

        media = (double) soma / numeros.length;

        System.out.println("\nSoma dos elementos do vetor: " + soma);
        System.out.println("\nMédia dos elementos do vetor: " + media);
    }
}
