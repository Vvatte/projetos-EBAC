package atividades.controleDeFluxos;

import java.util.Scanner;

public class ElseIff {

    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite o valor da nota: ");
        double nota = scanner.nextDouble();


        // Verifica se a nota é maior ou igual a 9 se sim executa o que esta dentro do if
        if(nota >= 9){
            System.out.println("Conceito A");
        }
        // Verifica se a nota é maior ou igual a 7 se sim executa o que esta dentro do else if
        else if(nota >= 7 ){
            System.out.println("Conceito B");
        }
        // Verifica se a nota é maior ou igual a 5 se sim executa o que esta dentro do else if
        else if(nota >= 5 ){
            System.out.println("Conceito C");
        }
        // Se não for nenhuma das opções acima executa o que está no else
        else{
            System.out.println("Reprovado");
        }

        scanner.close();
    }
    
}
