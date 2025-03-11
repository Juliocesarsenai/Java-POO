package funcionario;

public class Motoboy extends Funcionario{
  private String carteiradeHabilitacao;

  public Motoboy(String nome, String dataNascimento, Sexo sexo, Setor setor, double salarioBase, String carteiradeHabilitacao) {
    super(nome, dataNascimento, sexo, setor, salarioBase);
    this.carteiradeHabilitacao = carteiradeHabilitacao;
  }

  public String getCarteiradeHabilitacao() {
    return carteiradeHabilitacao;
  }

  public String toString() {
    return super.toString() + "\nCarteira de Habilitação: " + carteiradeHabilitacao;
  }
}
