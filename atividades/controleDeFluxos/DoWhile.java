package atividades.controleDeFluxos;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); 

        System.out.println("Para liberar o acesso você precisa acertar a senha");

        String senha;

        // Entra no loop pelo menos uma vez e pede para o usuário digitar a senha e se ela for diferente de "1234" fica repitindo
       do{
            System.out.print("Digite a senha: ");
            senha = scanner.next();

       }while(!senha.equals("1234"));

       System.out.print("Acesso liberado, a senha esta correta");

       scanner.close();
    }
}
