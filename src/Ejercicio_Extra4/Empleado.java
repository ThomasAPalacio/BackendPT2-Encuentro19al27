package Ejercicio_Extra4;

import java.util.Scanner;

public class Empleado extends Persona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected int anioIncorporacion;
    protected int numDespacho;

    public Empleado() {
    }

    public Empleado(int anioIncorporacion, int numDespacho, String nombre, String apellido, long identificacion, String estadoCivil) {
        super(nombre, apellido, identificacion, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.numDespacho = numDespacho;
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getNumDespacho() {
        return numDespacho;
    }

    public void setNumDespacho(int numDespacho) {
        this.numDespacho = numDespacho;
    }

    @Override
    public String toString() {
        return super.toString() + " año de Incorporacion = " + anioIncorporacion + ", numero de despacho = " + numDespacho + "\n";
    }

    public void reasignacionDespacho() {
        System.out.println("Quiere cambiar su numero de despacho? (S/N)");
        String op = leer.next();
        while (op.equalsIgnoreCase("S")) {
            System.out.println("Cual numero de despacho quiere? ");
            setNumDespacho(leer.nextInt());
            System.out.println("Ahora su numero de despacho es: " + getNumDespacho());
            System.out.println("Quiere cambiar su numero de despacho? (S/N)");
            op = leer.next();
        }
    }

}
