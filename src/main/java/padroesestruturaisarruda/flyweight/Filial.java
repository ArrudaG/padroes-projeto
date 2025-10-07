package padroesestruturaisarruda.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Filial {
    private final List<Empregado> empregados = new ArrayList<>();

    public void matricular(String nomeEmpregado, String nomeCidade, String uf) {
        Cidade cidade = CidadeFactory.getCidade(nomeCidade, uf);
        Empregado empregado = new Empregado(nomeEmpregado, cidade);
        empregados.add(empregado);
    }

    public List<String> obterEmpregados() {
        List<String> saida = new ArrayList<>();
        for(Empregado empregado : this.empregados) {
            saida.add(empregado.obterEmpregado());
        }
        return saida;
    }
}
