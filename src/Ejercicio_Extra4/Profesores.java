package Ejercicio_Extra4;

import java.util.Scanner;

public class Profesores extends Empleado{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String departamento;

    public Profesores() {
    }

    public Profesores(String departamento, int anioIncorporacion, int numDespacho, String nombre, String apellido, long identificacion, String estadoCivil) {
        super(anioIncorporacion, numDespacho, nombre, apellido, identificacion, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void cambioDepartamento() {
        System.out.println("Quiere cambiar su departamento? (S/N)");
        String op = leer.next();
        while (op.equalsIgnoreCase("S")) {
            System.out.println("A que departamento quiere cambiarse? ");
            setDepartamento(leer.next());
            System.out.println("Ahora su nuevo departamento es: " + getDepartamento());
            System.out.println("Quiere cambiar su departamento? (S/N)");
            op = leer.next();
        }
    }
    
    @Override
    public String toString() {
         return super.toString() + "departamento = " + departamento;
        
    }
     
}
