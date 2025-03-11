package interface_operacoes;

public class Multiplicacao implements OperacaoMatematica {
    @Override
    public double calcular(double x, double y) {
        return x * y;
 }
}
