// Aluno: Brunno Cunha Bernardes
// Matrícula: 202405846
// Data: 25/03/2025
// Descrição: Classe Produto com atributos nome, preço e quantidade. Possui métodos para adicionar e remover produtos do estoque, além de calcular o valor total em estoque.

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    protected double total() {
        return preco * quantidade;
    }

    protected void adicionar(int quantia) {
        if (quantia > 0) {
            this.quantidade += quantia;
        }
    }

    protected void remover(int quantia) {
        if (quantia > 0 && quantia <= this.quantidade) {
            this.quantidade -= quantia;
        }
    }
}