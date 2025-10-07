package padroesestruturaisarruda.flyweight;

public class Cidade {

    String nome;
    String uf;

    public Cidade(String nome, String uf) {
        this.nome = nome;
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public String getUf() {
        return uf;
    }
}
