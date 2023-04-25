package Exercicios_CollectionQueue;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercício_queue {
    public static void main(String[] args) {

        int cod;

        Scanner sc = new Scanner(System.in);

        Queue<String> fila = new LinkedList<String>() ;

        do{

        System.out.print("""
                ===============================================            
                \t\t1 - Adicionar Cliente na Fila.             
                \t\t2 - Listar todos os Clientes.                
                \t\t3 - Retirar Cliente da Fila.
                \t\t0 - Sair.               
                ===============================================
                """);

        System.out.println("\nDigite o código da função desejada: ");
        cod = sc.nextInt();
        sc.nextLine();

        switch (cod) {
            case 1:
            System.out.println("\nDigite o nome do cliente: ");
            String name = sc.nextLine();
            fila.add(name);
            System.out.println("\nCliente Adicionado!");
            System.out.println("Fila Atualizada: "+fila);
            System.out.println("\nAperte Enter para continuar");
            sc.nextLine();
            break;
            case 2:
                System.out.println();
                System.out.println("\nLista de Clientes: " + fila);
                System.out.println("\nAperte Enter para continuar");
                sc.nextLine();
                break;
            case 3:
                System.out.println();
                if (fila.isEmpty()){
                    System.out.println("A Fila está vazia!");
                    System.out.println("\nAperte Enter para continuar");
                    sc.nextLine();
                }else{
                    System.out.println("\nCliente "+fila.peek()+ " foi chamado(a) ");
                    fila.remove();
                    System.out.println("\nAperte Enter para continuar");
                    sc.nextLine();

                }
                break;
            case 0:
                System.out.println();
                System.out.println("\n");
                System.out.println("\nObrigado por utilizar esta ferramenta!!");
                System.out.println("\nEncerrando Aplicação...");
                break;
            default:
                System.out.println("Código Inválido!!");
                System.out.println("\nAperte Enter para continuar");
                sc.nextLine();
                sc.close();
            }
        }
        while(cod != 0);

    }
}