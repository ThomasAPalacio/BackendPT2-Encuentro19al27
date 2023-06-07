//Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
//La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
//Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
//mensaje por pantalla informando de que se alimenta. Generar una clase Ejercicio_1 que realice lo
//siguiente:
//VER CUADRO DEL EJERCICIO 1

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Animal perro1 = new Perro("Chiquito", "Dogui", 5, "Pitbull");
        Animal gato1 = new Gato("Lola", "Gati", 2, "callejero");
        Animal caballo1 = new Caballo("LLobaca", "pasto", 3, "Bayo");
        System.out.println(perro1.toString());
        perro1.alimentarse();
        System.out.println("--------------------------------");
        System.out.println(gato1.toString());
        gato1.alimentarse();
        System.out.println("--------------------------------");
        System.out.println(caballo1.toString());
        caballo1.alimentarse();

    }

}
