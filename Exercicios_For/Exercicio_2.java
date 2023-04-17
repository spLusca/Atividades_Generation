package Exercicios_For;

import java.util.Scanner;

public class Exercicio_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, par = 0, impar = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o %dº número inteiro: ", i);
            num = input.nextInt();

            if (num % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        System.out.printf("Você digitou %d números pares." , par);
        System.out.printf("\nVocê digitou %d números ímpares." , impar);

        input.close();
    }
}
