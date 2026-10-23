package Sistema_Banco;

public class Conta {

    private int numeroConta;
    private String titular;
    private double saldo;

    public Conta(int numeroConta,String titular){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valorDep){
        setSaldo(getSaldo() + valorDep);
        System.out.printf("Depósito de R$%.2f realizado com sucesso\n",valorDep);
    }

    public void sacar(double valorSaque){
        if (valorSaque <= getSaldo()){
            setSaldo(getSaldo() - valorSaque);
            System.out.printf("Saque de R$%.2f realizado com sucesso\n",valorSaque);
        }else{
            System.out.println("Saldo insuficiente para saque !");
        }
    }

    public void exibirDados(){
        System.out.println("Número da conta: "+ getNumeroConta());
        System.out.println("Nome do titular: "+ getTitular());
        System.out.printf("Saldo atual: R$%.2f ",getSaldo());
        System.out.println();
    }

}