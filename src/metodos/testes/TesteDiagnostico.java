package metodos.testes;

import metodos.dominio.DiagnosticoPC;

public class TesteDiagnostico {
    public static void main(String[] args) {
        DiagnosticoPC diagnostico = new DiagnosticoPC();
        String resultado = diagnostico.avaliarGargalo("Ryzen 5 5500", "RX 6600");
        System.out.println(resultado);
    }
    
}
