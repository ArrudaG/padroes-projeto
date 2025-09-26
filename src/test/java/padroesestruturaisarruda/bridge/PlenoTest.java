package padroesestruturaisarruda.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlenoTest {
    @Test
    void deveRetornarPlenoComCurso(){
        Competencias competencias = new Curso();
        Cargo cargo = new Pleno(2200.0f);
        cargo.setCompetencias(competencias);
        assertEquals(2200.0f, cargo.calcularSalario(), 0.01f);
    }
    @Test
    void deveRetornarPlenoComEnsinoSuperior(){
        Competencias competencias = new EnsinoSuperior();
        Cargo cargo = new Pleno(2200.0f);
        cargo.setCompetencias(competencias);
        assertEquals(2420.0f, cargo.calcularSalario(), 0.01f);
    }
    @Test
    void deveRetornarPlenoComPosGraduacao(){
        Competencias competencias = new PosGraduacao();
        Cargo cargo = new Pleno(2200.0f);
        cargo.setCompetencias(competencias);
        assertEquals(2530.0f, cargo.calcularSalario(), 0.01f);
    }
    @Test
    void deveRetornarPlenoComDoutorado(){
        Competencias competencias = new Doutorado();
        Cargo cargo = new Pleno(2200.0f);
        cargo.setCompetencias(competencias);
        assertEquals(2640.0f, cargo.calcularSalario(), 0.01f);
    }

}