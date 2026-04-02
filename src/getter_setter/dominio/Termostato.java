package getter_setter.dominio;

public class Termostato {
    private double temperaturaAtual;

    public double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(double temperaturaAtual) {
        if (temperaturaAtual >= 15 && temperaturaAtual <= 30) {
        
            this.temperaturaAtual = temperaturaAtual;

        } else {
            System.out.println("Temperatura inválida! O termostato aceita apenas valores entre 15.0 e 30.0 graus.");
        }
    }
    
    
}
