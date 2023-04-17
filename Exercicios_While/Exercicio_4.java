package Exercicios_While;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade, sexo, categoria, backend = 0, femFront = 0, mascMob = 0, femFull= 0;
        char continuar = 'S';

        while (continuar == 'S' || continuar == 's') {
            System.out.print("Digite a idade do colaborador: ");
            idade = leitor.nextInt();

            System.out.print("Digite o sexo do colaborador (1-Masculino / 2-Feminino / 3-Outros): ");
            sexo = leitor.nextInt();

            System.out.print("Digite a categoria do colaborador (1-Backend / 2-Frontend / 3-Mobile / 4-FullStack): ");
            categoria = leitor.nextInt();

            if (categoria == 1) {
                backend++;
            } else if (categoria == 2 && sexo == 2) {
                femFront++;
            } else if (categoria == 3 && sexo == 1 && idade > 40) {
                mascMob++;
            } else if (categoria == 4 && sexo == 2 && idade < 30) {
                femFull++;
            }

            System.out.print("Deseja continuar? (S/N): ");
            continuar = leitor.next().charAt(0);
        }

        System.out.println("O número de pessoas desenvolvedoras Backend: " + backend);
        System.out.println("O número de mulheres desenvolvedoras Frontend: " + femFront);
        System.out.println("O número de homens desenvolvedores Mobile maiores de 40 anos: " + mascMob);
        System.out.println("O número de mulheres desenvolvedoras FullStack menores de 30 anos: " + femFull);
    }
}
