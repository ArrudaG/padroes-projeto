package padroesestruturaisarruda.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CidadeFactory {
    private static final Map<String, Cidade> cidades = new HashMap<>();

    public static Cidade getCidade(String nome, String uf) {
        return cidades.computeIfAbsent(nome, n -> new Cidade(n, uf));
    }
    public static int getTotalCidades() {
        return cidades.size();
    }
}
