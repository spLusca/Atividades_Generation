package Exercicios_LacoCondicional_if;
import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = leia.nextInt();

        if (num % 2 == 0) {
            System.out.print("O numero " + num + " é par e ");
        } else {
            System.out.print("O numero " + num + " é impar e ");
        }

        if (num >= 0) {
            System.out.println("positivo!");
        } else {
            System.out.println("negativo!");
        }
    }
}

