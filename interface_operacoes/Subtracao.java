package interface_operacoes;

public class Subtracao implements OperacaoMatematica{
    @Override
    public double calcular(double x, double y) {
        return x - y;
    }
}
