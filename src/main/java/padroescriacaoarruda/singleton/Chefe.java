package padroescriacaoarruda.singleton;

public class Chefe {

    private Chefe() {}
    private static Chefe instance = new Chefe();
    public static Chefe getInstance() {
        return instance;
    }

    private String nomeEmpresa;
    private String empregadoLogado;

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String empresa) {
        this.nomeEmpresa = empresa;
    }

    public String getEmpregadoLogado() {
        return empregadoLogado;
    }

    public void setEmpregadoLogado(String empregado) {
        this.empregadoLogado = empregado;
    }
}
