package Exercicios_Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<Integer>();

        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(6);

        System.out.println("Digite o número que você deseja encontrar: ");
        int num = sc.nextInt();

        int posicao = -1;
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == num) {
                posicao = i;
                break;
            }
        }
        if (posicao != -1) {
            System.out.println("O número " + num + " foi encontrado na posição " + posicao);
        } else {
            System.out.println("O número " + num + " não foi encontrado!");
        }
    }
}