package atividades.calculoMedia;

import java.util.Scanner;

public class Nota {

    public static void main(String[] args){
        // Cria a variavel para ler e gravar o que o usuario digitou no terminal
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite a primeira nota: " );
        // Le o que o usuário digitou e transforma o valor em double
        double nota1 = Double.parseDouble(scanner.nextLine());
    
        System.out.print("\nDigite a segunda nota: " );
        double nota2 = Double.parseDouble(scanner.nextLine());
    
        System.out.print("\nnDigite a terceira nota: " );
        double nota3 = Double.parseDouble(scanner.nextLine());
    
        System.out.print("\nDigite a quarta nota: " );
        double nota4 = Double.parseDouble(scanner.nextLine());

        // Cria a variavel em que vai ficar guardado o valor da média e chama o método de calculo da média
        double media = calculoMedia(nota1, nota2, nota3, nota4);
     
        System.out.println("A média do aluno é: " + media);
    }

    // Método que pega 4 valores e retorna a média 
    public static double calculoMedia(double v1, double v2, double v3, double v4 ){
        return (v1 + v2 + v3 + v4) / 4;
    }
}
