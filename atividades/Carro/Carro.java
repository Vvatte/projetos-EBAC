package atividades.Carro;

public class Carro {
    
    String cor;

    String marca;

    String modelo;

    public static void main(String[] args){
        
        // Chama o método criarCarro e passa os parametros para a criação e faz um print do carro criado  
        System.out.println(criarCarro("Azul", "Volkswagen", "Fusca"));

    }

    // Método de criação de um novo carro
    public static Carro criarCarro(String cor, String marca, String modelo){
        Carro carro = new Carro();
        carro.cor =  cor;
        carro.marca = marca;
        carro.modelo = modelo;
        return carro;
    }

    // Define como o obj Carro deve aparecer quando for impresso
    @Override 
    public String toString(){
        return  "\nCor: "+ cor + 
                "\nMarca: " + marca + 
                "\nModelo: " + modelo;
    }

}
