package Gestão_Frota;

public class Motorista {
    //Atributos

    private String nome;
    private String CNH;

    public Motorista(String nome,String CNH){
        this.nome = nome;
        this.CNH = CNH;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCNH(){
        return this.CNH;
    }

    public void setCNH(String CNH){
        this.CNH = CNH;
    }

}