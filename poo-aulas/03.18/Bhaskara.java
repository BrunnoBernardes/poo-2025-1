public class Bhaskara {
    private double a, b, c;

    Bhaskara(double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculaX1() {

        double delta = (b * b) - 4 * a * c;

        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    public double calculaX2() {

        double delta = (b * b) - 4 * a * c;

        return (-b - Math.sqrt(delta)) / (2 * a);
    }

    public static void main(String[] args) {
        
        System.out.println("Aluno: Brunno Cunha Bernardes");
        System.out.println("Matrícula: 202405846");

        Bhaskara bhaskara = new Bhaskara(1, -3, -4);

        System.out.println("X1 = " + bhaskara.calculaX1());
        System.out.println("X2 = " + bhaskara.calculaX2());
    }
}
