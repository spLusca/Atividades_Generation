package Exerício_4;
import java.util.Scanner;
import java.util.Locale;
public class main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        float n1 = leia.nextFloat();

        System.out.println("Digite o segundo número: ");
        float n2 = leia.nextFloat();

        System.out.println("Digite o terceiro número: ");
        float n3 = leia.nextFloat();

        System.out.println("Digite o quarto número: ");
        float n4 = leia.nextFloat();

        float diff = ((n1 * n2) - (n3 * n4));
        System.out.println("A diferença entre o produto de " + n1 + " e " + n2 + " pelo produto de " + n3 + " e " + n4 + " é: " + diff);

        leia.close();
    }
}
