package Exercicios_While;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);

        int idade, menor21 = 0, maior50 = 0;

        System.out.print("Digite uma idade: ");
        idade = le.nextInt();
        while(idade >= 0){
            if(idade < 21){
                menor21++;
            }
            else if(idade > 50){
                maior50++;
            }
            System.out.print("Digite uma idade: ");
            idade = le.nextInt();
        }
        System.out.println("Total de pessoas menores de 21 anos: "+ menor21);
        System.out.println("\nTotal de pessoas maiores de 50 anos: "+ maior50);

        le.close();
    }
}
