package Exercicios_LacoCondicional_if;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a primeira caracteristica (Vertebrado/Invertebrado) : ");
        String c1 = leia.nextLine();
        System.out.println("Digite a segunda caracteristica (Ave/Mamifero/Inseto/Anelidio)");
        String c2 = leia.nextLine();
        System.out.println("Digite a terceira caracteristica (Carnivoro/Onivoro/Herbivoro/Hematogafo)");
        String c3 = leia.nextLine();

        if(c1.equalsIgnoreCase("vertebrado")){
            if(c2.equalsIgnoreCase("ave")){
                if(c3.equalsIgnoreCase("carnivoro")){
                    System.out.println("\nAguia");
                }
                else if(c3.equalsIgnoreCase("onivoro")){
                    System.out.println("\nPomba");
                }
            }
            else if(c2.equalsIgnoreCase("mamifero")){
                if(c3.equalsIgnoreCase("onivoro")){
                    System.out.println("\nHomem");
                }
                else if(c3.equalsIgnoreCase("herbivoro")){
                    System.out.println("\nVaca");
                }
            }
        }
        if(c1.equalsIgnoreCase("invertebrado")){
            if(c2.equalsIgnoreCase("inseto")){
                if(c3.equalsIgnoreCase("hematogafo")){
                    System.out.println("\nPulga");
                }
                else if(c3.equalsIgnoreCase("herbivoro")){
                    System.out.println("\nLagarta");
                }
            }
            else if(c2.equalsIgnoreCase("anelidio")){
                if(c3.equalsIgnoreCase("hematogafo")){
                    System.out.println("\nSanguessuga");
                }
            }
            else if(c3.equalsIgnoreCase("onivoro")){
                System.out.println("\nMinhoca");
            }
        }
        leia.close();
    }
}