# Nome: Brunno Cunha Bernardes
# Matrícula: 202405846

class Pessoa:
    def __init__(self, nome, idade, cpf, sexo):
        self.nome = nome
        self.idade = idade
        self.cpf = cpf
        self.sexo = sexo

    def andar(self, passos, tamanhoDepassos=None):
        if tamanhoDepassos is not None:
            print(f"{self.nome} andou {passos * tamanhoDepassos} metros.")
        else:
            print(f"{self.nome} andou {passos} passos.")


pessoa1 = Pessoa("Ana", 25, "123.456.789-00", "Feminino")
pessoa1.andar(10)

pessoa2 = Pessoa("Carlos", 30, "987.654.321-00", "Masculino")
pessoa2.andar(10, 0.7)