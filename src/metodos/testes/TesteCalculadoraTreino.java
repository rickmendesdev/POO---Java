package metodos.testes;

import java.util.Scanner;

import metodos.dominio.CalculadoraTreino;

public class TesteCalculadoraTreino {
    public static void main(String[] args) {
        CalculadoraTreino calculadora = new CalculadoraTreino();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu peso em kg: ");
        double peso = scanner.nextDouble();
        double aguaDiaria = calculadora.calcularAguaDiaria(peso);
        System.out.println("A quantidade diária de água recomendada é: " + aguaDiaria + " litros.");

        scanner.close();
    }
    
}
