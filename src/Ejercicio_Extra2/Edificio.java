package Ejercicio_Extra2;

import java.util.Scanner;

public abstract class Edificio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected double ancho;
    protected double alto;
    protected double largo;

    public Edificio() {
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public abstract void calcularSuperficie();

    public abstract void calcularVolumen();

}
