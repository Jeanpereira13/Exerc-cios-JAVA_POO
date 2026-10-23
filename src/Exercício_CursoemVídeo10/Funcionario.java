package Exercício_CursoemVídeo10;

public class Funcionario extends Pessoa{

    private String setor;
    private boolean trabalhando;

    public Funcionario(String nome,int idade,String sexo,String setor){
        super(nome,idade,sexo);
        this.setor = setor;
        this.trabalhando = true;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public void mudarSetor(String novoSetor){
        this.setor = novoSetor;
        System.out.println("O setor do funcionário atual,agora é : "+ getSetor());
    }
}