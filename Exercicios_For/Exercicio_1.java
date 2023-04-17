package Exercicios_For;

import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro número do intervalo: ");
        int n1 = leia.nextInt();

        System.out.print("\nDigite o segundo número do intervalo: ");
        int n2 = leia.nextInt();

        if(n1 >= n2){
            System.out.println("\nNúmeros inválidos! O primeiro número deve ser menor que o segundo.");
            return;
        }
        System.out.println("Múltiplos de 3 e 5 no intervalo de "+ n1 + "e" + n2);

        for (int i = n1; i<=n2; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i + " é múltiplo de 3 e 5\n");
            }

        }

    leia.close();

    }

}
