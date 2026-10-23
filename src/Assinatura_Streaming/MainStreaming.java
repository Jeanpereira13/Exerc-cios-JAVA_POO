package Assinatura_Streaming;

public class MainStreaming {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Jean","jeanpereira13@email.com");
        Plano plano1 = new Plano("Básico",21.90);
        Plano plano2 = new Plano("Premium",55.90);
        Assinatura assinatura = new Assinatura(usuario1,plano2);
        assinatura.detalhesAssinatura();
        assinatura.ativarAssinatura(usuario1,plano2);
        assinatura.detalhesAssinatura();
        assinatura.cancelarAssinatura();
        assinatura.detalhesAssinatura();
    }
}
