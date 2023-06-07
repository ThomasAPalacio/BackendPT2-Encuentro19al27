package Ejercicio_Extra2;

import java.util.Scanner;

public final class Polideportivo extends Edificio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private String nombre;
    private boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean techado, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    @Override
    public void calcularSuperficie() {
        double superficie;
        superficie = super.ancho * super.largo;
        System.out.println("La superficie total del edificio Polideportivo es: " +superficie);
    }

    @Override
    public void calcularVolumen() {
        double volumen;
        volumen = super.ancho * super.largo * super.alto;
        System.out.println("El volumen total del edificio del Polideportivo es: " + volumen);
    }

    @Override
    public String toString() {
        return "Polideportivo: " + "nombre =" + nombre + "\n tiene techo? = " + techado;
    }
    
    
    
}
