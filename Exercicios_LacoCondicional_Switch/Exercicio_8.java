package Exercicios_LacoCondicional_Switch;

import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        float saldo = 1000.0f;
        int cod;

        System.out.println("--------------------------");
        System.out.println("Código\t\tOperação");
        System.out.println("[1]\t\t\tSALDO");
        System.out.println("[2]\t\t\tSAQUE");
        System.out.println("[3]\t\t\tDEPÓSITO");
        System.out.println("--------------------------");

        System.out.println("Digite o código da operação desejada: ");
        cod = leia.nextInt();

        switch (cod){
            case 1:
                System.out.print("Operação - Saldo");
                System.out.printf("Seu saldo é: %.2f", saldo);
                break;
            case 2:
                System.out.print("Operação - Saque");
                System.out.print("Qual o valor do saque?: ");
                float saque = leia.nextFloat();
                if(saque<=saldo){
                    saldo = saldo - saque;
                    System.out.printf("Seu novo saldo é: %.2f", saldo);
                }
                else{
                    System.out.println("Saldo Insulficiente!");
                }
                break;
            case 3:
                System.out.print("Operação - Depósito");
                System.out.print("Quanto deseja depositar? :");
                float dep = leia.nextFloat();
                saldo = saldo + dep;
                System.out.printf("Seu novo saldo é : %.2f", saldo);
                break;
            default:
                System.out.println("Código de operação inválida!");
        }
    }
}
