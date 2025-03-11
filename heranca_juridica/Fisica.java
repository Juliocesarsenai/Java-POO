package heranca_juridica;

public class Fisica extends Pessoa {
    private String cpf;
    private String rg;

    public Fisica(String nome, String telefone, String cpf, String rg) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }   

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String toString() {
        return super.toString() + "\nCPF: " + cpf + "\nRG: " + rg;
    }
}
