package Exercicios_LacoCondicional_Switch;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String cargo = "", nome;
        double ns = 0, per = 0, sal;


        System.out.println("Digite seu nome: ");
        nome = leia.nextLine();
        System.out.println("\n-------------------------------------------------------");
        System.out.println("Código\t\t\tCargo\t\t\tPercentual do Ajuste");
        System.out.println("[1]\t\t\t\tGerente\t\t\t\t10%");
        System.out.println("[2]\t\t\t\tVendedor\t\t\t7%");
        System.out.println("[3]\t\t\t\tSupervisor\t\t\t9%");
        System.out.println("[4]\t\t\t\tMotorista\t\t\t6%");
        System.out.println("[5]\t\t\t\tEstoquista\t\t\t5%");
        System.out.println("[6]\t\t\t\tTécnico de TI\t\t8%");
        System.out.println("-------------------------------------------------------");

        System.out.println("\nDigite o código do cargo: ");
        int cod = leia.nextInt();
        System.out.println("\nDigite seu salário: ");
        sal = leia.nextDouble();

        switch(cod){
            case 1:
                cargo = "Gerente";
                per = 0.1;
                break;
            case 2:
                cargo = "Vendedor";
                per = 0.07;
                break;
            case 3:
                cargo = "Supervisor";
                per = 0.09;
                break;
            case 4:
                cargo = "Motorista";
                per = 0.06;
                break;
            case 5:
                cargo = "Estoquista";
                per = 0.05;
                break;
            case 6:
                cargo = "Técnico de TI";
                per = 0.08;
                break;
            default:
                System.out.println("Código Inválido.");
        }
        ns = sal + (per * sal);

        System.out.printf("\nNome do Colaborador: %s\n", nome);
        System.out.printf("\nCargo: %s\n", cargo);
        System.out.printf("\nSalário: %.2f", ns);

        leia.close();

    }

}
