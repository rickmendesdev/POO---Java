package metodos.dominio;

public class Personagem {
    public int vida = 100;
    public void receberDano(int dano) {
        vida -= dano;
        if (vida < 0) {
            System.out.println("Game Over!");
        }
    }
    
}
