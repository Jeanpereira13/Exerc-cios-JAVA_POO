package Exercício_Veículos;

public class Carro extends Veiculo{

    private int qtdPortas;
    private boolean possuiArCondicionado;

    public Carro(String marca,String modelo,int ano,int qtdPortas,boolean possuiArCondicionado){
        super(marca, modelo, ano);
        this.qtdPortas = qtdPortas;
        this.possuiArCondicionado = possuiArCondicionado;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public boolean isPossuiArCondicionado() {
        return possuiArCondicionado;
    }

    public void setPossuiArCondicionado(boolean possuiArCondicionado) {
        this.possuiArCondicionado = possuiArCondicionado;
    }

    public void ligarArCondicionado(){
        if (isPossuiArCondicionado() && isLigado()){
            System.out.printf("O ar-condicionado do carro %s foi ligado!\n",getModelo());
        } else if (isPossuiArCondicionado() && !isLigado()) {
            System.out.println("Não é possível ligar o ar-condicionado com o carro desligado");
        }else {
            System.out.printf("O carro %s não possui ar-condicionado",getModelo());
        }
    }

}