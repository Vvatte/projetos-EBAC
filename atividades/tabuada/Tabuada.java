package atividades.tabuada;

import java.util.Scanner;

public class Tabuada {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número que você deseja a tabuada:");
        Integer num = Integer.parseInt(scanner.nextLine());

        // Loop que inicializa um valor em 0 e vai até 10 com incremento     
        for (int i = 0; i <= 10; i++){
            // Faz o print do numero digitado * o valor que esta no loop de 0...10 e mostra o resultado
            System.out.println(num + " X " + i + " = " + num*i);
        }
    }
}
