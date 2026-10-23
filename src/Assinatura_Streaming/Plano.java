package Assinatura_Streaming;

public class Plano {

    private String nomePlano;
    private double valorMensal;

    public Plano(String nomePlano,double valorMensal){
        this.nomePlano = nomePlano;
        this.valorMensal = valorMensal;
    }

    public String getNomePlano(){
        return this.nomePlano;
    }

    public void setNomePlano(String nomePlano){
        this.nomePlano = nomePlano;
    }

    public double getValorMensal(){
        return this.valorMensal;
    }

    public void setValorMensal(double valorMensal){
        this.valorMensal = valorMensal;
    }
}