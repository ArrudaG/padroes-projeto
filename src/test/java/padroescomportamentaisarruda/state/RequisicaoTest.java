package padroescomportamentaisarruda.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequisicaoTest {

    Requisicao requisicao;

    @BeforeEach
    public void setUp() {
        requisicao = new Requisicao();
    }

    @Test
    public void deveRetornarRequisicaoRealizando() {
        requisicao.setEstado(RequisicaoEstadoAberta.getInstance());
        assertTrue(requisicao.realizar());
        assertEquals(RequisicaoEstadoRealizando.getInstance(), requisicao.getEstado());
    }

}