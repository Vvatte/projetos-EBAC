package atividades.controleDeFluxos;

import java.util.Scanner;

public class IfElse {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Verifica se o valor digitado é maior ou igual a 18, se sim faz o que esta dentro do if, se não faz o que esta no else
        if(idade >= 18){
            System.out.println("Maior de idade");
        }
        else{
            System.out.println("Menor de idade");
        }
    }
}
