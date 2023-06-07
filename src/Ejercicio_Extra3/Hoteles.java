package Ejercicio_Extra3;

import java.util.Scanner;

public class Hoteles extends Alojamiento {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected int cantidadHabitaciones;
    protected int numeroCamas;
    protected int cantidadPisos;
    protected double precioHabitaciones;

    public Hoteles() {
    }

    public Hoteles(int cantidadHabitaciones, int numeroCamas, int cantidadPisos, double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantidadPisos = cantidadPisos;
        this.precioHabitaciones = precioHabitaciones;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(double precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }

    @Override
    public String toString() {
        return super.toString() + "Hoteles: " + "cantidadHabitaciones = " + cantidadHabitaciones + ", numeroCamas = " + numeroCamas + ", cantidadPisos = " + cantidadPisos + ", precioHabitaciones = " + precioHabitaciones + "\n";
    }
    
    

}
