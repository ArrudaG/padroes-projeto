package padroesestruturaisarruda.flyweight;

public class Empregado {

    private final String nome;
    private final Cidade cidadeResidencia;

    public Empregado(String nome, Cidade cidadeResidencia){
        this.nome = nome;
        this.cidadeResidencia = cidadeResidencia;
    }

    public String obterEmpregado() {
        return "Empregado{" +
                "Nome = '" +
                this.nome + '\'' +
                ", cidade = '" +
                cidadeResidencia.getNome() + '\'' +
                ", UF = " + '\'' +
                cidadeResidencia.getUf() + "'}";
    }
}
