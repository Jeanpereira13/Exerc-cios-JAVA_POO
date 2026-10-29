package Exercício_Vídeo;

public class Video {

    private String titulo;
    private int duracao;
    private boolean reproduzindo;
    private int views;

    public Video(String titulo,int duracao){
        this.titulo = titulo;
        this.duracao = duracao;
        this.reproduzindo = false;
        this.views =  0;
    }

    private String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private int getDuracao() {
        return duracao;
    }

    private void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    private boolean isReproduzindo() {
        return reproduzindo;
    }

    private void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    private int getViews() {
        return views;
    }

    private void setViews(int views) {
        this.views = views;
    }

    public void reproduzir(){
        setReproduzindo(true);
        setViews(getViews() +1);
        System.out.println("Reproduzindo vídeo de modo padrão");
    }

    public void reproduzir(String qualidade){
        setReproduzindo(true);
        setViews(getViews() +1);
        System.out.printf("Reproduzindo vídeo em qualidade %s\n",qualidade);
    }

    public void reproduzir(String qualidade,double velocidade){
        setReproduzindo(true);
        setViews(getViews() +1);
        System.out.printf("Reproduzindo vídeo em qualidade %s e na velocidade %.1fx\n",qualidade,velocidade);
    }

    public void exibirDetalhes(){
        System.out.println("-----Detalhes do vídeo-----");
        System.out.printf("Título : %s\n",getTitulo());
        System.out.printf("Duração : %d min\n",getDuracao());
        System.out.printf("Views: %d\n",getViews());
        if (isReproduzindo()) {
            System.out.println("Status: Reproduzindo");
        }else {
            System.out.println("Status: Pausado");
        }
    }

}
