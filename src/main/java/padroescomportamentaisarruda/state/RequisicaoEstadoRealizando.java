package padroescomportamentaisarruda.state;

public class RequisicaoEstadoRealizando extends RequisicaoEstado{

    private RequisicaoEstadoRealizando() {}
    private static RequisicaoEstadoRealizando instance = new RequisicaoEstadoRealizando();
    public static RequisicaoEstadoRealizando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Realizando";
    }

    public boolean cancelar(Requisicao requisicao) {
        requisicao.setEstado(RequisicaoEstadoCancelada.getInstance());
        return true;
    }

    public boolean concluir(Requisicao requisicao) {
        requisicao.setEstado(RequisicaoEstadoConcluida.getInstance());
        return true;
    }

    public boolean abrir(Requisicao requisicao) {
        requisicao.setEstado(RequisicaoEstadoAberta.getInstance());
        return true;
    }
}

