public class Bhaskara {
private double a, b, c;

Bhaskara(double a, double b, double c) {
  this.a = a;
  this.b = b;
  this.c = c;
}

public double calculaX1() {

   double delta = (b*b)-4*(a)*(c);

return (-b + Math.sqrt(delta) ) / (2*a);
}

public double calculaX2() {
   
       double delta = (b*b)-4*(a)*(c);
    
    
return (-b - Math.sqrt(delta) ) / (2*a);
}

public static void main (String args[]) {
    Bhaskara bascara = new Bhaskara(2,-5,-7);
System.out.println(bascara.calculaX1());
System.out.println(bascara.calculaX2());
}
}