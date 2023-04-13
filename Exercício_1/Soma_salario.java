package Exercício_1;
import java.util.Locale;
import java.util.Scanner;
public class Soma_salario {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o salario: ");
        float salario = leia.nextFloat();

        System.out.println("Digite o abono: ");
        float abono = leia.nextFloat();

        Float novoSalario = (salario + abono);
        System.out.printf("O novo salario é: %.2f", novoSalario);

        leia.close();
    }

}
