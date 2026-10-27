package Exercício_Escola;

public class ProfessorEscola extends PessoaEscola{

    private String especialidade;
    private double salario;

    public ProfessorEscola(String nome,int idade,String sexo,String especialidade,double salario){
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void receberAumento(double valor){
        setSalario(getSalario() + valor);
        System.out.println("Novo salário definido");
    }

    public void exibirProfessor(){
        System.out.printf("Professor: %s\n",getNome());
        System.out.printf("Idade: %d\n",getIdade());
        System.out.printf("Sexo: %s\n",getSexo());
        System.out.printf("Especialidade: %s\n",getEspecialidade());
        System.out.printf("Salário: R$%.2f\n",getSalario());
    }
}