package Exercício_CursoemVídeo10;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro", 40, "M");
        Aluno p2 = new Aluno("Jean", 19, "M", 1001, "Ciência da Computação");
        Professor p3 = new Professor("Guanabara", 45, "M", "Java", 5000.00);
        Funcionario p4 = new Funcionario("Maria", 30, "F", "Estoque");

        p2.detalhes();
        System.out.println();
        p3.receberAumento(575.00);
        System.out.println();
        p4.mudarSetor("Recepção");
        System.out.println();
        p2.fazerAniversário();
        p2.detalhes();
    }
}