package getter_setter.dominio;

public class Produto {
    private String nomeProduto;
    private double preco;
    private int quantidadeEmEstoque;

    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        if ( preco <= 0) {
            System.out.println("O preço que voce inseriu é invalido...");
            return;
        } else{
            this.preco = preco;
        }       
    }
    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    
}
