package padroescomportamentaisarruda.state;

public class Requisicao {

    private String nome;
    private RequisicaoEstado estado;

    public Requisicao() {
        this.estado = RequisicaoEstadoAberta.getInstance();
    }

    public boolean abrir() {
        return estado.abrir(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public boolean concluir() {
        return estado.concluir(this);
    }

    public boolean realizar() {
        return estado.realizar(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RequisicaoEstado getEstado() {
        return estado;
    }

    public void setEstado(RequisicaoEstado estado) {
        this.estado = estado;
    }
}
