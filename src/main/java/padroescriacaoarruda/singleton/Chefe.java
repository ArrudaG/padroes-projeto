package padroescriacaoarruda.singleton;

public class Chefe {

    private Chefe() {};
    private static Chefe instance = new Chefe();
    public static Chefe getInstance() {return instance; }

    private String nomeEmpresa;
    private String empregadoLogado;

    public String getEmpresa() {return nomeEmpresa;}

    public void setEmpresa(String empresa) {this.nomeEmpresa = empresa;}

    public String getEmpregado() {return empregadoLogado;}

    public void setEmpregado(String empregado) {this.empregadoLogado = empregado;}
}
