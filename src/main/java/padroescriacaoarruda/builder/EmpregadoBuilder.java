package padroescriacaoarruda.builder;

public class EmpregadoBuilder {

    private Empregado empregado;

    public EmpregadoBuilder() {
        empregado = new Empregado();
    }

    public Empregado build() {
        if (empregado.getCodigo() == 0) {
            throw new IllegalArgumentException("Codigo invalido");
        }
        if (empregado.getNome().equals("")) {
            throw new IllegalArgumentException("Nome invalido");
        }
        return empregado;
    }

    public EmpregadoBuilder setCodigo(int codigo) {
        empregado.setCodigo(codigo);
        return this;
    }
    public EmpregadoBuilder setNome(String nome) {
        empregado.setNome(nome);
        return this;
    }
    public EmpregadoBuilder setCargo(String cargo) {
        empregado.setCargo(cargo);
        return this;
    }
    public EmpregadoBuilder setCpf(String cpf) {
        empregado.setCpf(cpf);
        return this;
    }
    public EmpregadoBuilder setRg(String rg) {
        empregado.setRg(rg);
        return this;
    }
    public EmpregadoBuilder setEscolaridade(String escolaridade) {
        empregado.setEscolaridade(escolaridade);
        return this;
    }
    public EmpregadoBuilder setEndereco(String endereco) {
        empregado.setEndereco(endereco);
        return this;
    }
    public EmpregadoBuilder setEmail(String email) {
        empregado.setEmail(email);
        return this;
    }
    public EmpregadoBuilder setCelular(String celular) {
        empregado.setCelular(celular);
        return this;
    }
}