package Exercício_Escola;

public class ProfessorPesquisador extends ProfessorEscola{

    private String linhaPesquisa;

    public ProfessorPesquisador(String nome,int idade,String sexo,String especialidade,double salario,String linhaPesquisa){
        super(nome, idade, sexo, especialidade, salario);
        this.linhaPesquisa = linhaPesquisa;
    }

    public String getLinhaPesquisa() {
        return linhaPesquisa;
    }

    public void setLinhaPesquisa(String linhaPesquisa) {
        this.linhaPesquisa = linhaPesquisa;
    }

    public void conduzirPesquisa(){
        System.out.printf("O professor pesquisador %s está liderando estudos na área de %s !\n",getNome(),getLinhaPesquisa());
    }

}