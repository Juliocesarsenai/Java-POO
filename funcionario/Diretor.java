package funcionario;

public class Diretor extends Funcionario {
    private double premio;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase, double premio) {
        super(nome, dataNascimento, sexo, setor, salarioBase);
        this.premio = premio;
    }

    public double getPremio() {
        return premio;
    }



}
