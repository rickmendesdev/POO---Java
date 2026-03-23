package metodos.testes;

import java.util.Scanner;

import metodos.dominio.Personagem;

public class TestePersonagem {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanto de dano vc vai dar? ");
        int dano = scanner.nextInt();
        personagem.receberDano(dano);



        scanner.close();
    }
    
}
