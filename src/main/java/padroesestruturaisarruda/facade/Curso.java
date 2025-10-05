package padroesestruturaisarruda.facade;

public class Curso extends Setor {
    private static Curso curso = new Curso();

    private Curso() {};

    public static Curso getInstance() {
        return curso;
    }
}
