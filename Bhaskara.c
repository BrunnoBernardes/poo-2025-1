#include <stdio.h>
#include <math.h>

double calculaX1(double a, double b, double c) {
   double delta = (b*b)-4*(a)*(c);
   return (-b + sqrt(delta)) / (2*a);
}

double calculaX2(double a, double b, double c) {
   double delta = (b*b)-4*(a)*(c);
   return (-b - sqrt(delta)) / (2*a);
}

int main(int argc, char** argv)  {
   double  a, b, c;
     
   printf("X1 = %lf", calculaX1(2, -5, -7));
   printf("X2 = %lf", calculaX2(2, -5, -7));
   return 0;
}
