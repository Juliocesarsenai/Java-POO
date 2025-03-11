package heranca_juridica;

public class Juridica extends Pessoa{
    private String cnpj;
    private String inscricaoEstadual;

    public Juridica(String nome, String telefone, String cnpj, String inscricaoEstadual) {
        super(nome, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }
    
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }
    
    // Setters
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    // toString
    @Override
    public String toString() {
        return super.toString() +
                "\nCNPJ:" + cnpj  +
                "\nInscricão Estadual: " + inscricaoEstadual 
                
            ;
    }


}
