package atividades.controleDeFluxos;

import java.util.Scanner;
public class While {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Olá digite números para serem somados, e para sair e retornar o resultado digite 0");
        System.out.println("\nDigite o primeiro número");
        double num = scanner.nextDouble();

        double total = 0;

        // Entra em um loop enquanto o usuario não digitar 0
        while(num != 0){
            // Soma o valor de num a uma variavel que guarda o total dos números digitados 
            total += num;
            System.out.println("\nDigite o próximo número");
            num = scanner.nextDouble();    
        }

        System.out.println("\nO resultado dos números digitados é " + total);
        
        scanner.close();
    }
}
