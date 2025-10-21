package padroescomportamentaisarruda.state;

public class RequisicaoEstadoAberta extends RequisicaoEstado{

    private RequisicaoEstadoAberta() {}
    private static RequisicaoEstadoAberta instance = new RequisicaoEstadoAberta();
    public static RequisicaoEstadoAberta getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Aberta";
    }

    public boolean cancelar(Requisicao requisicao) {
        requisicao.setEstado(RequisicaoEstadoCancelada.getInstance());
        return true;
    }

    public boolean concluir(Requisicao requisicao) {
        requisicao.setEstado(RequisicaoEstadoConcluida.getInstance());
        return true;
    }

    public boolean realizar(Requisicao requisicao) {
        requisicao.setEstado(RequisicaoEstadoRealizando.getInstance());
        return true;
    }
}
