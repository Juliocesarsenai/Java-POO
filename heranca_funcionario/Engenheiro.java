package heranca_funcionario;

public class Engenheiro extends Funcionario{
    private String crea;

    public Engenheiro(String nome, String email, double salario, Endereco endereco, String crea) {
        super(nome, email, salario, endereco);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    public String toString() {
        return super.toString() + "\nCREA: " + crea;
    }
}
