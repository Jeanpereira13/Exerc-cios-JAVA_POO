package Exercício_CursoemVideo09;

public class Livro implements Publicação {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo,String autor,int totPaginas,Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor =  leitor;
    }

    private String getTitulo(){
        return this.titulo;
    }

    private void setTitulo(String titulo){
        this.titulo = titulo;
    }

    private String getAutor(){
        return this.autor;
    }

    private void setAutor(String autor){
        this.autor = autor;
    }

    private int getTotPaginas(){
        return this.totPaginas;
    }

    private void setTotPaginas(int totPaginas){
        this.totPaginas = totPaginas;
    }

    private int getPagAtual(){
        return this.pagAtual;
    }

    private void setPagAtual(int pagAtual){
        this.pagAtual = pagAtual;
    }

    private boolean isAberto(){
        return this.aberto;
    }

    private void setAberto(boolean aberto){
        this.aberto = aberto;
    }

    private Pessoa getLeitor(){
        return this.leitor;
    }

    private void setLeitor(Pessoa leitor){
        this.leitor = leitor;
    }

    public void detalhes(){
        System.out.println();
        System.out.println("Título: "+ getTitulo());
        System.out.println("Autor: "+ getAutor());
        System.out.println("Total de páginas: "+getTotPaginas());
        System.out.println("Página atual: "+getPagAtual());
        if (isAberto()){
            System.out.println("Livro aberto");
        }else {
            System.out.println("Livro fechado");
        }
        System.out.println("Leitor: "+leitor.getNome() + "/Idade: " + leitor.getIdade() + "/Sexo: " + leitor.getSexo());
    }

    @Override
    public void abrir() {
        setAberto(true);
    }

    @Override
    public void fechar() {
        setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (p<= getTotPaginas()){
            setPagAtual(p);
            setAberto(true);
        }
    }

    @Override
    public void avancarPag() {
        setPagAtual(getPagAtual()+1);
        setAberto(true);
    }

    @Override
    public void voltarPag() {
        setPagAtual(getPagAtual()-1);
        setAberto(true);
    }
}