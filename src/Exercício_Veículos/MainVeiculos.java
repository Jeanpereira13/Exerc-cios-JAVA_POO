package Exercício_Veículos;

public class MainVeiculos {
    public static void main(String[] args) {
        Carro carro = new Carro("Chevrolet","Vectra CD",2002,4,true);
        Moto moto = new Moto("Honda","CB600F",2012,600,true);

        //Teste dos métodos dos objetos criados
        System.out.println("");
        carro.ligarArCondicionado();
        System.out.println("");
        carro.ligar();
        System.out.println("");
        carro.ligarArCondicionado();
        System.out.println("");
        carro.exibirDetalhes();
        System.out.println("");
        moto.empinar();
        System.out.println("");
        moto.ligar();
        System.out.println("");
        moto.empinar();
        System.out.println("");
        moto.exibirDetalhes();
    }
}