package Exercício_2;
import java.util.Scanner;
import java.util.Locale;
public class Media_soma_de_notas {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float nota1 = leia.nextFloat();

        System.out.println("Digite a segunda nota: ");
        float nota2 = leia.nextFloat();

        System.out.println("Digite a terceira nota: ");
        float nota3 = leia.nextFloat();

        System.out.println("Digite a quarta nota: ");
        float nota4 = leia.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.printf("\nSua média é: %.1f", media);

        leia.close();
    }


}