package metodos.testes;

import metodos.dominio.ContaBancaria;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        System.out.println(contaBancaria.realizarSaque(200));
    }
    
}
