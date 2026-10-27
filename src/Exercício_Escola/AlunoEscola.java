package Exercício_Escola;

public class AlunoEscola extends PessoaEscola{

    private int matricula;
    private String curso;
    private double mensalidade;

    public AlunoEscola(String nome,int idade,String sexo,int matricula,String curso,double mensalidade){
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
        this.mensalidade = mensalidade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public void pagarMensalidade(){
        System.out.printf("A mensalidade de R$%.2f do aluno %s foi paga!",getMensalidade(),getNome());
    }

    public void exibirAluno(){
        System.out.printf("Aluno: %s\n",getNome());
        System.out.printf("Idade: %d\n",getIdade());
        System.out.printf("Sexo: %s\n",getSexo());
        System.out.printf("Matrícula: %d\n",getMatricula());
        System.out.printf("Curso: %s\n",getCurso());
        System.out.printf("Valor da mensalidade: R$%.2f\n",getMensalidade());
    }

}