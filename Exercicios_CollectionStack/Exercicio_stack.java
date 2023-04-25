package Exercicios_CollectionStack;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio_stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> pilhaLivros = new Stack<String>();

        int opcao;

        do {
            System.out.println("""
                   
            1 - Adicionar livro na pilha.
            2 - Listar todos os livros.
            3 - Retirar livro da pilha.
            0 - Sair.
             """);

            System.out.println("\nDigite uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nDigite o nome do livro: ");
                    String nomeLivro = sc.nextLine();
                    pilhaLivros.push(nomeLivro);
                    System.out.println("\nPilha:\n" + pilhaLivros);
                    System.out.println("\nLivro adicionado!");
                    System.out.println("\nAperte Enter para continuar");
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("\nLista de Livros na Pilha:\n" + pilhaLivros);
                    System.out.println("\nAperte Enter para continuar");
                    sc.nextLine();
                    break;
                case 3:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("\nA Pilha está vazia!");
                        System.out.println("\nAperte Enter para continuar");
                        sc.nextLine();
                    } else {
                        String livroRetirado = pilhaLivros.pop();
                        System.out.println("\nPilha:\n" + pilhaLivros);
                        System.out.println("\n" + livroRetirado + " foi retirado da pilha!");
                        System.out.println("\nAperte Enter para continuar");
                        sc.nextLine();
                    }
                    break;
                case 0:
                    System.out.println("\nPrograma Finalizado!");
                    break;
                default:
                    System.out.println("\nOpção Inválida!");
                    break;
            }
        } while (opcao != 0);
        sc.close();
    }
}
