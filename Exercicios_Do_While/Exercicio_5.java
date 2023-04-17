package Exercicios_Do_While;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);

        int numero, somaPositivos = 0;

        do {
            System.out.print("Digite um número: ");
            numero = le.nextInt();

            if (numero > 0) {
                somaPositivos += numero;
            }
        } while (numero != 0);

        System.out.println("A soma dos números positivos é: " + somaPositivos);
    }
}