package Exercício_Escola;

public class MainEscola {
    public static void main(String[] args) {

        AlunoEscola aluno = new AlunoEscola("Pedro",16,"M",123456,"Mecânica",150.00);
        ProfessorEscola professor = new ProfessorEscola("Marcos",45,"M","Elétrica",2500.00);
        ProfessorPesquisador profPesquisador = new ProfessorPesquisador("João",60,"M","Combustível",5000.00,"Combustíveis fósseis");

        System.out.println();
        aluno.fazerAniversario();
        System.out.println();
        aluno.exibirAluno();
        System.out.println();
        professor.receberAumento(300.00);
        System.out.println();
        professor.exibirProfessor();
        System.out.println();
        profPesquisador.receberAumento(100.00);
        System.out.println();
        profPesquisador.exibirProfessor();
        System.out.println();
        profPesquisador.conduzirPesquisa();

    }
}