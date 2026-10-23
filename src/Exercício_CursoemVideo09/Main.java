package Exercício_CursoemVideo09;

public class Main {
    public static void main(String[] args) {
        Pessoa Jean = new Pessoa("Jean",19,"M");
        Livro livro = new Livro("Use a cabeça Java","Kathy Sierra,Bert Bates e Trisha Gee",736,Jean);
        livro.detalhes();
        livro.folhear(117);
        livro.detalhes();
        livro.fechar();
        livro.detalhes();
        livro.avancarPag();
        livro.detalhes();
        livro.voltarPag();
        livro.detalhes();
    }
}