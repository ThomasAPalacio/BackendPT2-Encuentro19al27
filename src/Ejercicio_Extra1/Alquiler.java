package Ejercicio_Extra1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler {

    private String nombre;
    private String dni;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private String posAmarre;
    private Barco barco;
    private int diasOcupados;

    public Alquiler(String nombre, String dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, String posAmarre,
            Barco barco) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posAmarre = posAmarre;
        this.barco = barco;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getPosAmarre() {
        return posAmarre;
    }

    public void setPosAmarre(String posAmarre) {
        this.posAmarre = posAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public int getDiasOcupados() {
        return diasOcupados;
    }

    public void setDiasOcupados(int diasOcupados) {
        this.diasOcupados = diasOcupados;
    }

    public int calcularDias() {

        long diasAlquilados = ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);
        diasOcupados = (int) diasAlquilados;
        return diasOcupados;
    }

}
