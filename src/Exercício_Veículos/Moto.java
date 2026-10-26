package Exercício_Veículos;

public class Moto extends Veiculo{

    private int cilindradas;
    private boolean partidaEletrica;

    public Moto(String marca,String modelo,int ano,int cilindradas,boolean partidaEletrica){
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
        this.partidaEletrica = partidaEletrica;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    public void empinar(){
        if (isLigado()){
            System.out.printf("A moto %s de %d cilindradas está empinando!\n",getModelo(),getCilindradas());
        }else {
            System.out.println("Não é possível empinar com a moto desligada");
        }
    }

}