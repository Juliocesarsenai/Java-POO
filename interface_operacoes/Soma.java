package interface_operacoes;

public class Soma implements OperacaoMatematica {
    @Override
    public double calcular(double x, double y) {
        return x + y;
    }

}
