package padroesestruturaisarruda.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeniorTest {
    @Test
    void deveRetornarSeniorComCurso(){
        Competencias competencias = new Curso();
        Cargo cargo = new Senior(2800.0f);
        cargo.setCompetencias(competencias);
        assertEquals(2800.0f, cargo.calcularSalario(), 0.01f);
    }
    @Test
    void deveRetornarSeniorComEnsinoSuperior(){
        Competencias competencias = new EnsinoSuperior();
        Cargo cargo = new Pleno(2800.0f);
        cargo.setCompetencias(competencias);
        assertEquals(3080.0f, cargo.calcularSalario(), 0.01f);
    }
    @Test
    void deveRetornarSeniorComPosGraduacao(){
        Competencias competencias = new PosGraduacao();
        Cargo cargo = new Senior(2800.0f);
        cargo.setCompetencias(competencias);
        assertEquals(3220.0f, cargo.calcularSalario(), 0.01f);
    }
    @Test
    void deveRetornarSeniorComDoutorado(){
        Competencias competencias = new Doutorado();
        Cargo cargo = new Senior(2800.0f);
        cargo.setCompetencias(competencias);
        assertEquals(3360.0f, cargo.calcularSalario(), 0.01f);
    }

}