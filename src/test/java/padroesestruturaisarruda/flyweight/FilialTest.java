package padroesestruturaisarruda.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilialTest {

    @Test
    void deveRetornarEmpregados() {
        Filial filial = new Filial();
        filial.matricular("Jose", "Maranhao", "MA");
        filial.matricular("Maria", "Maranhao", "MA");
        filial.matricular("Cleusa", "Piaui", "PI");
        filial.matricular("Pablo", "Piaui", "PI");

        List<String> saida = Arrays.asList(
                "Empregado{Nome = 'Jose', cidade = 'Maranhao', UF = 'MA'}",
                "Empregado{Nome = 'Maria', cidade = 'Maranhao', UF = 'MA'}",
                "Empregado{Nome = 'Cleusa', cidade = 'Piaui', UF = 'PI'}",
                "Empregado{Nome = 'Pablo', cidade = 'Piaui', UF = 'PI'}"
        );
        assertEquals(saida, filial.obterEmpregados());
    }

    @Test
    void deveRetornarQuantidadeDeCidades() {
        Filial filial = new Filial();
        filial.matricular("Jose", "Maranhao", "MA");
        filial.matricular("Maria", "Maranhao", "MA");
        filial.matricular("Cleusa", "Piaui", "PI");
        filial.matricular("Pablo", "Piaui", "PI");

        assertEquals(2, CidadeFactory.getTotalCidades());
    }


}