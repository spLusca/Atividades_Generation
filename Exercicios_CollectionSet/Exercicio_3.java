package Exercicios_CollectionSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_3 {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<Integer>();

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 10) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
            count++;
        }
        System.out.println("Listar dados do Set: ");
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}