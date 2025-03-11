package heranca_funcionario;

public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String cidade;
    private String cep;

    public Endereco(String logradouro, String numero, String complemento, String cidade, String cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }
    
    public String getComplemento() {
        return complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String toString() {
        return "\nLogradouro: " + logradouro + "\nNúmero: " + numero + "\nComplemento: " + complemento + "\nCidade: " + cidade + "\nCEP: " + cep;
    }



    
}
