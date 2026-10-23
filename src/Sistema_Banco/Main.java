package Sistema_Banco;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta(1234,"Maria");
        ContaCorrente cCor = new ContaCorrente(5678,"Carlos",15.00);
        ContaEspecial cEsp = new ContaEspecial(1908,"Jean",20.00,500.00);

        c1.depositar(100.00);
        cCor.depositar(100.00);
        cEsp.depositar(100.00);
        System.out.println("");

        cCor.cobrarTaxa();
        cEsp.sacarEspecial(300.00);
        System.out.println("");

        c1.exibirDados();
        System.out.println("");
        cCor.exibirDados();
        System.out.println("");
        cEsp.exibirDados();
    }
}
