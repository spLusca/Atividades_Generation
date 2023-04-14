package Exercicios_LacoCondicional_if;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o nome do doador: ");
        String nome = leia.nextLine();

        System.out.println("Digite a idade do doador: ");
        int idade = leia.nextInt();

        System.out.println("É a primeira doação de sangue? ");
        boolean primDoacao = leia.nextBoolean();

        if (idade >= 18 && idade <= 69) {
            if (idade >= 60 && idade <= 69 && primDoacao) {
                System.out.println(nome + " nao esta apto para doar sangue!");
            } else {
                System.out.println(nome + " esta apto para doar sangue!");
            }
        } else {
            System.out.println(nome + " nao esta apto para doar sangue!");
        }

        leia.close();

    }
}
