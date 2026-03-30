package metodos.testes;

import metodos.dominio.Treinador;

public class TesteTreinador {
    public static void main(String[] args) {
        Treinador treinador = new Treinador();
        System.out.println(treinador.tentarCapturar("Eve", 49));
    }
    
}
