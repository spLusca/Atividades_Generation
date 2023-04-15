package Exercicios_LacoCondicional_Switch;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int cod;
        float total = 0, num1, num2;

        System.out.println("\nDigite o primeiro número: ");
        num1 = leia.nextFloat();

        System.out.println("\nDigite o segundo número: ");
        num2 = leia.nextFloat();

        System.out.println("\n--------------------------------");
        System.out.println("Código\t\tOperação");
        System.out.println("[1]\t\t\tSoma");
        System.out.println("[2]\t\t\tSubtração");
        System.out.println("[3]\t\t\tMultiplicação");
        System.out.println("[4]\t\t\tDivisão");
        System.out.println("--------------------------------");

        System.out.println("\nDigite o código da operação: ");
        cod = leia.nextInt();

        switch (cod){
            case 1:
                total = num1 + num2;
                System.out.printf("%.2f + %.2f = %.2f", num1, num2, total);
                break;
            case 2:
                total = num1 - num2;
                System.out.printf("%.2f - %.2f = %.2f", num1, num2, total);
                break;
            case 3:
                total = num1 * num2;
                System.out.printf("%.2f * %.2f = %.2f",num1, num2, total);
                break;
            case 4:
                total = num1 / num2;
                System.out.printf("%.2f / %.2f = %.2f",num1, num2, total);
                break;
            default:
                System.out.println("Código de Operação Inválida");
        }
        leia.close();
    }
}