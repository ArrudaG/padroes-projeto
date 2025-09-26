package padroesestruturaisarruda.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JuniorTest {
    @Test
    void deveRetornarJuniorComCurso(){
        Competencias competencias = new Curso();
        Junior junior = new Junior(1600.0f);
        junior.setCompetencias(competencias);
        assertEquals(1600.0f, junior.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarJuniorComEnsinoSuperior(){
        Competencias competencias = new EnsinoSuperior();
        Junior junior = new Junior(1600.0f);
        junior.setCompetencias(competencias);
        assertEquals(1600.0f, junior.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarJuniorComPosGraduacao(){
        Competencias competencias = new PosGraduacao();
        Junior junior = new Junior(1600.0f);
        junior.setCompetencias(competencias);
        assertEquals(1600.0f, junior.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarJuniorComDoutorado(){
        Competencias competencias = new Doutorado();
        Junior junior = new Junior(1600.0f);
        junior.setCompetencias(competencias);
        assertEquals(1600.0f, junior.calcularSalario(), 0.01f);
    }
}