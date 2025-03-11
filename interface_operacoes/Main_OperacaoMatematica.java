package interface_operacoes;

public class Main_OperacaoMatematica {
 public static void main(String[] args) {
        Soma soma = new Soma();
        Multiplicacao multiplicacao = new Multiplicacao();
        Subtracao subtracao = new Subtracao();
        Divisao divisao = new Divisao();
        System.out.println(soma.calcular(2, 3));
        System.out.println(multiplicacao.calcular(2, 3));
        System.out.println(divisao.calcular(4, 2));
        System.out.println(subtracao.calcular(4, 2));
 }
}
