//Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
//geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
//dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
//dos métodos para calcular el área, el perímetro y el valor de PI como constante.
//Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
//calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
//resultado final.
//Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
//Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
package Ejercicio_4;

import static java.lang.Math.PI;
import java.util.Scanner;

public class Ejercicio_4{

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Calculos c1 = new Calculos();
        
        System.out.println("Ingrese el area para el circulo: ");
        double radio = leer.nextDouble();
        double PI = Math.PI;
        c1.areaCirculo(PI, radio);
        System.out.println("Ingrese el diametro del circulo: ");
        double diametro = leer.nextDouble();
        c1.perimetroCirculo(PI, diametro);
        
        System.out.println("Ingrese la base del rectangulo: ");
        double base = leer.nextDouble();
        System.out.println("Ingrese la altura del rectangulo: ");
        double altura = leer.nextDouble();
        c1.areaRectangulo(base, altura);
        c1.perimetroRectangulo(base, altura);
    }

}
