package Exercícios_variaveis;
import java.util.Scanner;
import java.util.Locale;
public class Soma_salario2 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o salario bruto: ");
        float salBrut = leia.nextFloat();

        System.out.println("Digite o adicional noturno: ");
        float adNot = leia.nextFloat();

        System.out.println("Digite as horas extras: ");
        float horExt = leia.nextFloat();

        System.out.println("Digite os descontos: ");
        float desc = leia.nextFloat();

        float salLiq = (salBrut + adNot + (horExt * 5) - desc);

        System.out.printf("\nO salario Liquido é: %.2f", salLiq);

        leia.close();
    }

}
