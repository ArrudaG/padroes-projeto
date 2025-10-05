package padroesestruturaisarruda.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpregadoTest {

    @Test
    void deveRetornarFaltaCapacidade() {
        Empregado empregado = new Empregado();
        Capacidade.getInstance().addEmpregadoCapacitado(empregado);

        assertFalse(empregado.promocao());
    }

    @Test
    void deveRetornarFaltaCurso() {
        Empregado empregado = new Empregado();
        Curso.getInstance().addEmpregadoCapacitado(empregado);

        assertFalse(empregado.promocao());
    }

    @Test
    void deveRetornarFaltaTempoDeExperiencia() {
        Empregado empregado = new Empregado();
        TempoDeExperiencia.getInstance().addEmpregadoCapacitado(empregado);

        assertFalse(empregado.promocao());
    }

    @Test
    void deveRetornarEmpregadoPromovido() {
        Empregado empregado = new Empregado();

        assertTrue(empregado.promocao());
    }

}