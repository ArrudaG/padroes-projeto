package padroescriacaoarruda.singleton;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ChefeTest {

    @Test
    public void deveRetornarNomeEmpresa () {
        Chefe.getInstance().setNomeEmpresa("Valle Sul");
        assertEquals("Valle Sul", Chefe.getInstance().getNomeEmpresa());
    }

    @Test
    public void deveRetornarEmpregadoLogado () {
        Chefe.getInstance().setEmpregadoLogado("Empregado 1");
        assertEquals("Empregado 1", Chefe.getInstance().getEmpregadoLogado());
    }

}