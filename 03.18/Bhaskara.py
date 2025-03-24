import math

class Bhaskara:
    def __init__(self, a, b, c):
        self.a = a
        self.b = b
        self.c = c

    def calcula_x1(self):
        delta = (self.b ** 2 - 4 * self.a * self.c)
        return (-self.b + math.sqrt(delta)) / (2 * self.a)

    def calcula_x2(self):
        delta = (self.b ** 2 - 4 * self.a * self.c)
        return (-self.b - math.sqrt(delta)) / (2 * self.a)

print("Aluno: Brunno Cunha Bernardes")
print("Matrícula: 202405846")

bascara = Bhaskara(1, -6, 5)

print("X1 =", bascara.calcula_x1())
print("X2 =", bascara.calcula_x2())
