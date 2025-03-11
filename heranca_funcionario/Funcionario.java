package heranca_funcionario;


public abstract class Funcionario {
    private String nome;
    private String email;
    private double salario;
    private Endereco endereco;

    public Funcionario(String nome, String email, double salario, Endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.salario = salario;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public double getSalario() {
        return salario;
    }
    public Endereco getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        return "Nome: " + nome + "\nEmail: " + email + "\nSalário: " + salario + "\nEndereço: " + endereco;
    }
}
