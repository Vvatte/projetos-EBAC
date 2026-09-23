import java.util.Scanner;

public class Calculadora {

    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o calculo desejado:" );
        String expressao = scanner.nextLine();

        String[] partes = expressao.split(" ");

        double var1 = Double.parseDouble(partes[0]);
        String operador = partes[1];
        double var2 = Double.parseDouble(partes[2]);

        double resultado = 0;
    
        switch (operador) {
            case "+":
                resultado = soma(var1, var2);
                break;
            case "-":
                resultado = subtracao(var1, var2);
                break;
            case "*":
                resultado = multiplicacao(var1, var2);
                break;
            case "/":
                resultado = divisao(var1, var2);
                break;
            default:
                System.out.println("Operador inválido!");
                scanner.close();
                return;
        }

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }

    public static double soma(double var1, double var2){
        return var1 + var2;
        
    }

    public static double subtracao(double var1, double var2){
        return var1 - var2;
    }

    public static double divisao(double var1, double var2){
        return var1 / var2;
    }

    public static double multiplicacao(double var1, double var2){
        return  var1 * var2;
    }

}
