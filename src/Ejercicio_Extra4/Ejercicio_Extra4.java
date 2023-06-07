//Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
//la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
//tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
//información debe gestionar esta aplicación:
//• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
//identificación y su estado civil.
//• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
//incorporación a la facultad y qué número de despacho tienen asignado.
//• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
//matriculados.
//• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
//pertenecen (lenguajes, matemáticas, arquitectura, ...).
//• Sobre el personal de servicio, hay que conocer a qué sección están asignados
//(biblioteca, decanato, secretaría, ...).
//El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
//continuación, debe programar las clases definidas en las que, además de los constructores,
//hay que desarrollar los métodos correspondientes a las siguientes operaciones:
//• Cambio del estado civil de una persona.
//• Reasignación de despacho a un empleado.
//• Matriculación de un estudiante en un nuevo curso.
//• Cambio de departamento de un profesor.
//• Traslado de sección de un empleado del personal de servicio.
//• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
//que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.
package Ejercicio_Extra4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_Extra4 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        List<Estudiantes> e1 = new ArrayList<>();
        List<Profesores> e2 = new ArrayList<>();
        List<Personal> e3 = new ArrayList<>();

        Estudiantes p1 = new Estudiantes("Analista de sistemas", 2020, 14, "Ariel", "Rodriguez", 597498, "Soltero");
        p1.cambiarEstadoCivil();
        p1.reasignacionDespacho();
        p1.nuevoCurso();
        e1.add(p1);
        for (Persona aux1 : e1) {
            if (aux1 instanceof Estudiantes) {
                System.out.println("Hola, soy un estudiante");
                System.out.println("Mis datos son: \n" + aux1);
            }
        }
        System.out.println("--------------------------------------------------------------");
        Profesores p2 = new Profesores("Matematicas", 2010, 147, "Camila", "Cabello", 264968, "casado por civil");
        p2.cambiarEstadoCivil();
        p2.reasignacionDespacho();
        p2.cambioDepartamento();
        e2.add(p2);
        for (Profesores aux2 : e2) {
            if (aux2 instanceof Profesores) {
                System.out.println("Hola, soy un profesor");
                System.out.println("Mis datos son: \n" + aux2);
            }
        }
        System.out.println("--------------------------------------------------------------");
        Personal p3 = new Personal("biblioteca", 2016, 78, "Adrian", "Mercado", 147968, "viudo");
        p3.cambiarEstadoCivil();
        p3.reasignacionDespacho();
        p3.cambiarSeccion();
        e3.add(p3);
        for (Personal aux3 : e3) {
            if (aux3 instanceof Personal) {
                System.out.println("Hola, soy un profesor");
                System.out.println("Mis datos son: \n" + aux3);
            }
        }
        System.out.println("--------------------------------------------------------------");
    }
}
