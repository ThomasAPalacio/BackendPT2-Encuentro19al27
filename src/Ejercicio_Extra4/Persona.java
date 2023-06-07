package Ejercicio_Extra4;

import java.util.Scanner;

public class Persona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected String nombre;
    protected String apellido;
    protected long identificacion;
    protected String estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, long identificacion, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.estadoCivil = estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre + ", apellido = " + apellido + " identificacion = " + identificacion + ", estadoCivil = " + estadoCivil + "\n";
    }

    public void cambiarEstadoCivil() {
        System.out.println("Quiere cambiar su estado civil? (S/N)");
        String op = leer.next();
        while (op.equalsIgnoreCase("S")) {
            System.out.println("Soltero, casado por civil, divorciado legalmente,\n separado legalmente o viudo de matrimonio civil");
            setEstadoCivil(leer.next());
            System.out.println("Ahora su estado civil es: " + getEstadoCivil());
            System.out.println("Quiere cambiar su estado civil? (S/N)");
            op = leer.next();
        } 

    }

}
