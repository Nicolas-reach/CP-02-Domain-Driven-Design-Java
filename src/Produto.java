import java.util.Locale;

public class Produto {

    private int numeroItem;
    private String nome;
    private int quantidade;
    private double preco;
    private boolean ativo = true;

    // Construtor padrão: o compilador inicializa os campos com seus valores padrão
    public Produto() {
    }

    // Construtor sobrecarregado com parâmetros para todos os campos
    public Produto(int numeroItem, String nome, int quantidade, double preco) {
        this.numeroItem = numeroItem;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    // Converte o valor booleano em um texto amigável
    public String getStatus() {
        if (ativo) {
            return "Ativo";
        } else {
            return "Descontinuado";
        }
    }

    // Valor do inventário = preço x quantidade em estoque
    public double getValorInventario() {
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return String.format(Locale.US,
                "Número do Item         :  %d%n"
              + "Nome                   :  %s%n"
              + "Quantidade em Estoque  :  %d%n"
              + "Preço                  :  R$ %.2f%n"
              + "Valor do Estoque       :  R$ %.2f%n"
              + "Status do Produto      :  %s%n",
                numeroItem, nome, quantidade, preco, getValorInventario(), getStatus());
    }
}
