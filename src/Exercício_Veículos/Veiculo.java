package Exercício_Veículos;

public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;

    public Veiculo(String marca,String modelo,int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar(){
        setLigado(true);
        System.out.printf("O veículo %s foi ligado\n",getModelo());
    }

    public void desligar(){
        setLigado(false);
        System.out.printf("O veículo %s foi desligado\n",getModelo());
    }

    public void exibirDetalhes(){
        System.out.println("Marca: "+ getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Ano: "+ getAno());
        if (isLigado()) {
            System.out.println("Estado atual: Ligado");
        }else {
            System.out.println("Estado atual: Desigado");
        }
    }

}