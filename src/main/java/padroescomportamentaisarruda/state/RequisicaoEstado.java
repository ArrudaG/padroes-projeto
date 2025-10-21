package padroescomportamentaisarruda.state;

public abstract class RequisicaoEstado {

    public abstract String getEstado();

    public boolean abrir (Requisicao requisicao) {
        return false;
    }

    public boolean cancelar (Requisicao requisicao) {
        return false;
    }

    public boolean concluir (Requisicao requisicao) {
        return false;
    }

    public boolean realizar (Requisicao requisicao) {
        return false;
    }
}
