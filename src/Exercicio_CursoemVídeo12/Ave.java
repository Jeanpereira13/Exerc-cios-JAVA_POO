package Exercicio_CursoemVídeo12;

public class Ave extends Animal{

    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
}
