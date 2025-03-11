package funcionario;

public abstract class Funcionario {
    protected String nome;
    protected String dataNascimento;
    protected Sexo sexo;
    protected Setor setor;
    protected double salarioBase;

    public Funcionario(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getSalarioFinal(){
        return salarioBase;
    }
}
