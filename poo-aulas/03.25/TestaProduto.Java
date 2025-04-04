// Aluno: Brunno Cunha Bernardes
// Matrícula: 202405846
// Data: 25/03/2025
// Descrição: Classe TestaProduto para testar a classe Produto. Cria um objeto Produto, exibe suas informações, adiciona e remove produtos do estoque e calcula o valor total em estoque.

public class TestaProduto {

    public TestaProduto() {
        Produto produto = new Produto("Teclado Mecânico", 600.00, 10);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Quantidade em estoque: " + produto.getQuantidade());

        produto.adicionar(20);
        System.out.println("Quantidade após adicionar: " + produto.getQuantidade());

        produto.remover(4);
        System.out.println("Quantidade após remover: " + produto.getQuantidade());

        System.out.println("Valor total em estoque: R$ " + produto.total());
    }

    public static void main(String[] args) {
        new TestaProduto();
}
