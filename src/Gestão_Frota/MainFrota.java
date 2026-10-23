package Gestão_Frota;

public class MainFrota {
    public static void main(String[] args) {

        Motorista M1 = new Motorista("Carlos","123456789");
        Carro C1 = new Carro("Civic","ABC-1234");
        Viagem V1 = new Viagem("São Paulo");
        V1.resumoViagem();
        System.out.println();
        V1.iniciarViagem(M1,C1);
        System.out.println();
        V1.resumoViagem();
        System.out.println();
        V1.finalizarViagem();
        System.out.println();
        V1.resumoViagem();
    }
}