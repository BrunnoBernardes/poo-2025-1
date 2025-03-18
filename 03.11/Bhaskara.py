import math

class Bhaskara:
    def __init__(self, a, b, c):
        self.a = a
        self.b = b
        self.c = c

    def calcula_x1(self):
        delta = (self.b **2 -4 *  self.a * self.c) 
        return (-self.b + math.sqrt(delta)) / (2 * self.a)

    def calcula_x2(self):
        delta = (self.b **2 -4 * self.a  * self.c)
        return (-self.b - math.sqrt(delta)) / (2 * self.a)

# Executando o código
bascara = Bhaskara(2, -5, -7)
print(bascara.calcula_x1())
print(bascara.calcula_x2())