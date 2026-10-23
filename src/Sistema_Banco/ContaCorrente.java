package Sistema_Banco;

public class ContaCorrente extends Conta {

    private double taxaManutencao;

    public ContaCorrente(int numeroConta,String titular,double taxaManutencao){
        super(numeroConta, titular);
        this.taxaManutencao = taxaManutencao;
    }

    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(double taxaManutencaoo) {
        this.taxaManutencao = taxaManutencao;
    }

    public void cobrarTaxa(){
        setSaldo(getSaldo() - getTaxaManutencao());
        System.out.printf("Taxa de manutenção no valor de R$%.2f cobrada !\n",getTaxaManutencao());
    }
}