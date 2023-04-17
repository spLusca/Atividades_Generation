package Exercicios_Do_While;

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);

        int numero, somaMultiplosDeTres = 0, quantidadeMultiplosDeTres = 0;
        double mediaMultiplosDeTres;

        do {
            System.out.print("Digite um número: ");
            numero = le.nextInt();

            if (numero != 0 && numero % 3 == 0) {
                somaMultiplosDeTres += numero;
                quantidadeMultiplosDeTres++;
            }
        } while (numero != 0);

        if (quantidadeMultiplosDeTres > 0) {
            mediaMultiplosDeTres = (double) somaMultiplosDeTres / quantidadeMultiplosDeTres;
            System.out.println("A média de todos os números múltiplos de 3 é: " + mediaMultiplosDeTres);
        } else {
            System.out.println("Nenhum número múltiplo de 3 foi digitado.");
        }
    }
}

