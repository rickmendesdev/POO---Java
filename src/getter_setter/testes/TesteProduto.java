package getter_setter.testes;

import getter_setter.dominio.Produto;

public class TesteProduto {
    public static void main(String[] args) {
        Produto produto01 = new Produto();
        produto01.setNomeProduto("Sabonete");
        produto01.setPreco(9.99);
        produto01.setQuantidadeEmEstoque(100);
        System.out.println("Nome: " + produto01.getNomeProduto());
        System.out.println("Preço: " + produto01.getPreco());
        System.out.println("Estoque: " + produto01.getQuantidadeEmEstoque());

    }
    
}
