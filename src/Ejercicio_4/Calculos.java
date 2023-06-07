package Ejercicio_4;

import java.util.Scanner;

public class Calculos implements CalculosFormas{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    @Override
    public void areaCirculo(double PI, double radio) {
        System.out.println("El area del circulo es: ");
      double res = PI * Math.pow(radio, 2);
        System.out.println(res);
    }

    @Override
    public void perimetroCirculo(double PI, double diametro) {
        System.out.println("El perimetro del circulo es: ");
        double res = PI * diametro;
        System.out.println(res);
    }

    @Override
    public void areaRectangulo(double base, double altura) {
        System.out.println("El area del rectangulo es: ");
        double res = base * altura;
        System.out.println(res);
      
    }

    @Override
    public void perimetroRectangulo(double base, double altura) {
        System.out.println("El perimetro del rectangulo es: ");
        double res = (base + altura) + 2;
        System.out.println(res);
    }
}
