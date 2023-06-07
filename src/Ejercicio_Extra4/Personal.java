package Ejercicio_Extra4;

import java.util.Scanner;

public class Personal extends Empleado{
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private String seccionAsignada;

    public Personal() {
    }

    public Personal(String seccionAsignada, int anioIncorporacion, int numDespacho, String nombre, String apellido, long identificacion, String estadoCivil) {
        super(anioIncorporacion, numDespacho, nombre, apellido, identificacion, estadoCivil);
        this.seccionAsignada = seccionAsignada;
    }

    public String getSeccionAsignada() {
        return seccionAsignada;
    }

    public void setSeccionAsignada(String seccionAsignada) {
        this.seccionAsignada = seccionAsignada;
    }

    public void cambiarSeccion() {
        System.out.println("Quiere cambiar su seccion asignada? (S/N)");
        String op = leer.next();
        while (op.equalsIgnoreCase("S")) {
            System.out.println("Cual seccion quiere tener? (biblioteca, decanato, secretaría, etc) ");
            setSeccionAsignada(leer.next());
            System.out.println("Ahora su nuevo curso es: " + getSeccionAsignada());
            System.out.println("Quiere cambiar su seccion asignada? (S/N)");
            op = leer.next();
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + "seccionAsignada = " + seccionAsignada;
         
    }
}
