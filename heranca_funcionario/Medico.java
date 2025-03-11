package heranca_funcionario;

public class Medico extends Funcionario{
    private String crm;

    public Medico(String nome, String email, double salario, Endereco endereco, String crm) {
        super(nome, email, salario, endereco);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String toString() {
        return super.toString() + "\nCRM: " + crm;
    }
}
