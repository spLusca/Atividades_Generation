package Exercicios_LacoCondicional_Switch;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        String produto = "";
        double preco = 0, total = 0;


        System.out.println("-------------------Lanchonete do Lucas-------------------");
        System.out.println("Código do Produto\tProduto\t\t\tPreço Unitário");
        System.out.println("[1]\t\t\tCachorro Quente\t\tR$ 10.00");
        System.out.println("[2]\t\t\tX-Salada\t\t\tR$ 15.00");
        System.out.println("[3]\t\t\tX-Bacon\t\t\t\tR$ 18.00");
        System.out.println("[4]\t\t\tBauru\t\t\t\tR$ 12.00");
        System.out.println("[5]\t\t\tRefrigerante\t\tR$ 8.00");
        System.out.println("[6]\t\t\tSuco de Laranja\t\tR$ 13.00");
        System.out.println("---------------------------------------------------------");

        System.out.println("Escolha o produto (de 1 a 6): ");
        int escolha = leia.nextInt();
        System.out.println("Escolha a quatidade: ");
        int quant = leia.nextInt();

        switch(escolha){
            case 1:
                produto = "Cachorro Quente";
                preco = 10.00;
                break;
            case 2:
                produto = "X-Salada";
                preco = 15.00;
                break;
            case 3:
                produto = "X-Bacon";
                preco = 18.00;
                break;
            case 4:
                produto = "Bauru";
                preco = 12.00;
                break;
            case 5:
                produto = "Refrigerante";
                preco = 8.00;
                break;
            case 6:
                produto = "Suco de Laranja";
                preco = 13.00;
                break;
            default:
                System.out.println("Produto invalido");
        }
        total = quant * preco;

        System.out.printf("\nProduto: %s\n", produto);
        System.out.printf("Valor total: %.2f", total);

        leia.close();
    }
}