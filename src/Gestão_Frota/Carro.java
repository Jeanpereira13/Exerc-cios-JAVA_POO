package Gestão_Frota;

public class Carro {
    //Atributos

    private String modelo;
    private String placa;

    public Carro(String modelo,String placa){
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getPlaca(){
        return this.placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

}