//Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
//edificio tendrá como métodos:
//• Método calcularSuperficie(): calcula la superficie del edificio.
//• Método calcularVolumen(): calcula el volumen del edifico.
//Estos métodos serán abstractos y los implementarán las siguientes clases:
//• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
//Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
//• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
//por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
//los atributos del padre.
//De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
//usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
//(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
//cuantas personas entrarían en un piso y cuantas en todo el edificio.
//
//Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
//dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
//métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
//superficie y el volumen de cada edificio.
//Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
//techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
//cantPersonas() y mostrar los resultados de cada edificio de oficinas.
package Ejercicio_Extra2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_Extra2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        List<Edificio> e1 = new ArrayList<>();
        Edificio f1 = new EdificioDeOficinas(4, 6, 2, 2.5, 7, 5.5);
        Edificio f2 = new EdificioDeOficinas(3, 2, 3, 5, 9, 6.5);
        Edificio p1 = new Polideportivo("Polideportivo de Avellaneda", true, 7, 3, 5.5);
        Edificio p2 = new Polideportivo("Polideportivo de Quilmes", false, 6, 2, 9);
        e1.add(f1);
        e1.add(f2);
        e1.add(p1);
        e1.add(p2);

        int cont = 0;
        for (Edificio aux : e1) {
            if (aux instanceof Polideportivo) {
                //ASI LLAMO A UN OBJETO YA INSTANCIADO SIN CREARLO NUEVAMENTE
                Polideportivo poli = (Polideportivo) aux;
                if (poli.isTechado() == false) {
                    System.out.println("El " + poli.getNombre() + " no tiene techo");
                    System.out.println("-----------------------");
                } else {
                    System.out.println("El " + poli.getNombre() + " tiene techo");
                    System.out.println("-----------------------");
                    cont++;
                }
                poli.calcularSuperficie();
                System.out.println("-----------------------");
                poli.calcularVolumen();
                System.out.println("-----------------------");
            }
        }
        System.out.println("Los polideportivos techados son: " + cont);

        for (Edificio aux2 : e1) {
            if (aux2 instanceof EdificioDeOficinas) {
                EdificioDeOficinas ofi = (EdificioDeOficinas) aux2;
                System.out.println("Las oficinas tienen: ");
                ofi.getCantidadPersonas();
                System.out.println("-------------------");
                ofi.calcularSuperficie();
                System.out.println("-------------------");
                ofi.calcularVolumen();
                System.out.println("-------------------");
            }
        }
    }
}
