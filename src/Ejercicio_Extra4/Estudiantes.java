package Ejercicio_Extra4;

import java.util.Scanner;

public class Estudiantes extends Empleado {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String cursoMatriculado;

    public Estudiantes() {
    }

    public Estudiantes(String cursoMatriculado, int anioIncorporacion, int numDespacho, String nombre, String apellido, long identificacion, String estadoCivil) {
        super(anioIncorporacion, numDespacho, nombre, apellido, identificacion, estadoCivil);
        this.cursoMatriculado = cursoMatriculado;
    }

    public String getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(String cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    public void nuevoCurso() {
        System.out.println("Quiere cambiar su curso Matriculado? (S/N)");
        String op = leer.next();
        while (op.equalsIgnoreCase("S")) {
            System.out.println("Cual curso Matriculado quiere hacer? ");
            setCursoMatriculado(leer.next());
            System.out.println("Ahora su nuevo curso es: " + getCursoMatriculado());
            System.out.println("Quiere cambiar su curso Matriculado? (S/N)");
            op = leer.next();
        }
    }

    @Override
    public String toString() {
        return super.toString() + "cursoMatriculado = " + cursoMatriculado;
    }

}
