package Gestão_Frota;

public class Viagem {

    private String destino;
    private Motorista motorista;
    private Carro carro;
    private boolean emAndamento;

    public Viagem(String destino){
        this.destino = destino;
        this.motorista = null;
        this.carro = null;
        this.emAndamento = false;
    }

    private String getDestino(){
        return this.destino;
    }

    private void setDestino(String destino){
        this.destino = destino;
    }

    private Motorista getMotorista(){
        return this.motorista;
    }

    private void setMotorista(Motorista motorista){
        this.motorista = motorista;
    }

    private Carro getCarro(){
        return this.carro;
    }

    private void setCarro(Carro carro){
        this.carro = carro;
    }

    private boolean isEmAndamento(){
        return this.emAndamento;
    }

    private void setEmAndamento(boolean emAndamento){
        this.emAndamento = emAndamento;
    }
    //Métodos de negócio

    public void iniciarViagem(Motorista m,Carro c){
        this.motorista = m;
        this.carro = c;
        setEmAndamento(true);
        System.out.println("Viagem para "+ getDestino() +" iniciada!");
    }

    public void finalizarViagem(){
        setEmAndamento(false);
        System.out.println("Viagem finalizada com sucesso!");
    }

    public void resumoViagem(){
        if (getMotorista() != null && getCarro() != null) {
            System.out.println("Destino: " + getDestino());
            System.out.println("Motorista: " + getMotorista().getNome());
            System.out.println("N° CNH: " + getMotorista().getCNH());
            System.out.println("Modelo do carro: " + getCarro().getModelo());
            System.out.println("Placa: " + getCarro().getPlaca());
            if (isEmAndamento()) {
                System.out.println("Status: Em andamento");
            } else {
                System.out.println("Status: Viagem finalizada com sucesso !");
            }
        } else {
            System.out.println("Viagem não configurada corretamente!");
        }
    }
}