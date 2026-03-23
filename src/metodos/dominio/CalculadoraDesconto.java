package metodos.dominio;

public class CalculadoraDesconto {
    public double calcularValorFinal(double valorDaCompra){
        double desconto = 0.05;
        return valorDaCompra - (valorDaCompra * desconto);
    }
    public double calcularValorFinal(double valorDaCompra, String cupom ){
        if (cupom.equals("JAVA20")) {
            double desconto = 0.20;
            return valorDaCompra - (valorDaCompra * desconto);
        } else{
            double desconto = 0.05;
            return valorDaCompra - (valorDaCompra * desconto);
        }
    }

}