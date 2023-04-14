package Exercicios_LacoCondicional_if;
import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o numero A: ");
        int a = leia.nextInt();

        System.out.println("Digite o numero B: ");
        int b = leia.nextInt();

        System.out.println("Digite o numero C: ");
        int c = leia.nextInt();
        leia.close();
        int soma = a + b;

        if(soma > c) {
            System.out.println( b + " + " + a + " = " + soma + " > " + c );
            System.out.println("A Soma de A + B é maior do que C");
        }
        else if(soma == c){
            System.out.println( b + " + " + a + " = " + soma + " = " + c );
            System.out.println("A Soma de A + B é igual a C");
        }
        else{
            System.out.println( b + " + " + a + " = " + soma + " < " + c );
            System.out.println("A Soma de A + B é menor do que C");
        }
    }
}
