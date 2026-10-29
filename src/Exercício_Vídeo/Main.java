package Exercício_Vídeo;

public class Main {
    public static void main(String[] args) {

        Video video = new Video("Programação Orientada á objetos",15);

        video.reproduzir();
        video.exibirDetalhes();
        System.out.println();
        video.reproduzir("4K");
        video.exibirDetalhes();
        System.out.println();
        video.reproduzir("4K",1.5);
        video.exibirDetalhes();
    }
}
