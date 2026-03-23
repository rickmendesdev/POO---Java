package metodos.testes;

import metodos.dominio.CalculadoraDesconto;

public class TesteCalculadoraDesconto {
    public static void main(String[] args) {
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();

        System.out.println("O valor final é: " + calculadoraDesconto.calcularValorFinal(100));
        System.out.println("O valor final é: " + calculadoraDesconto.calcularValorFinal(100, "JAVA20"));
    }
    
}
