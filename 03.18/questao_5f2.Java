// Nome: Brunno Cunha Bernardes
// Matrícula: 202405846

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private char sexo;

    public Pessoa(String nome, int idade, String cpf, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public void andar(int passos) {
        System.out.println(this.nome + " andou " + passos + " passos.");
    }

    public void andar(int passos, double tamanhoPasso) {
        double distancia = passos * tamanhoPasso;
        System.out.println(this.nome + " andou " + distancia + " metros.");
    }

    public static void main(String[] args) {
        Pessoa fulano = new Pessoa("Brunno", 23, "202.903.542-11", 'M');
        fulano.andar(5);
        fulano.andar(5, 1.5);
    }
}
