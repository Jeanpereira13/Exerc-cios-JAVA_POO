package Assinatura_Streaming;

public class Assinatura {

    private Usuario usuario;
    private Plano plano;
    private boolean ativa;

    public Assinatura(Usuario usuario,Plano plano){
       this.usuario = null;
       this.plano = null;
       this.ativa = false;
    }

    private Usuario getUsuario(){
        return this.usuario;
    }

    private void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    private Plano getPlano(){
        return this.plano;
    }

    private void setPlano(Plano plano){
        this.plano = plano;
    }

    private boolean isAtiva(){
        return this.ativa;
    }

    private void setAtiva(boolean ativa){
        this.ativa = ativa;
    }

    public void ativarAssinatura(Usuario u,Plano p){
        this.usuario = u;
        this.plano = p;
        setAtiva(true);
        System.out.println("Assinatura do plano "+ p.getNomePlano() +" ativada para o usuário "+u.getNome());
    }

    public void cancelarAssinatura(){
        setAtiva(false);
        System.out.println("Assinatura cancelada com sucesso!");
    }

    public void detalhesAssinatura(){
        if (usuario != null && plano != null){
            System.out.println("Nome do usuário: "+usuario.getNome());
            System.out.println("E-mail: "+ usuario.getEmail());
            System.out.println("Nome do plano: "+plano.getNomePlano());
            System.out.printf("Valor mensal: R$%.2f\n",plano.getValorMensal());
            if (isAtiva()){
                System.out.println("Status: Ativa");
            }else{
                System.out.println("Status: Inativa");
            }
        }else{
            System.out.println("Assinatura pendente ou não configurada!");
        }
    }

}