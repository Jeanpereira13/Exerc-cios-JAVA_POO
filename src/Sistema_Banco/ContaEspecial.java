package Sistema_Banco;

public class ContaEspecial extends ContaCorrente{

    private double limite;

    public ContaEspecial(int numeroConta,String titular,double taxaManutencao,double limite){
        super(numeroConta, titular, taxaManutencao);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void sacarEspecial(double valorSaque){
        if (valorSaque <= (getSaldo() + getLimite())){
            setSaldo(getSaldo() - valorSaque);
            System.out.printf("Saque especial no valor de R$%.2f realizado com sucesso !\n",valorSaque);
        }else{
            System.out.println("Limite de cheque especial excedido !");
        }
    }

}
