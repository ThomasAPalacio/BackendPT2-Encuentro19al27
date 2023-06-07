package Ejercicio_Extra3;

import java.util.Scanner;

public class Camping extends Alojamiento {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected int capacidadMaximaCarpas;
    protected int cantidadBanios;
    protected boolean poseeRestaurante;

    public Camping() {
    }

    public Camping(int capacidadMaximaCarpas, int cantidadBanios, boolean poseeRestaurante, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.cantidadBanios = cantidadBanios;
        this.poseeRestaurante = poseeRestaurante;
    }

    public int getCapacidadMaximaCarpas() {
        return capacidadMaximaCarpas;
    }

    public void setCapacidadMaximaCarpas(int capacidadMaximaCarpas) {
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
    }

    public int getCantidadBanios() {
        return cantidadBanios;
    }

    public void setCantidadBanios(int cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }

    public boolean isPoseeRestaurante() {
        return poseeRestaurante;
    }

    public void setPoseeRestaurante(boolean poseeRestaurante) {
        this.poseeRestaurante = poseeRestaurante;
    }
    
    /*public Camping crearCamping(){
        System.out.println("Ingrese el nombre del alojamiento");
        this.nombre = leer.next();
        System.out.println("Ingrese la dirección del alojamiento");
        this.direccion = leer.next();
        System.out.println("Ingrese la localidad del alojamiento");
        this.localidad = leer.next();
        System.out.println("Ingrese el gerente del alojamiento");
        this.gerente = leer.next();
        System.out.println("Ingrese la capacidad máxima de carpas");
        this.capacidadMaximaCarpas = leer.nextInt();
        System.out.println("Ingrese la cantidad de baños");
        this.cantidadBanios = leer.nextInt();
        System.out.println("Ingrese si posee restaurante (1=Si, 0=No)");
        this.poseeRestaurante = leer.nextInt() == 1;
        return this;
    */

    @Override
    public String toString() {
        return super.toString() + "Camping: " + " capacidadMaximaCarpas = " + capacidadMaximaCarpas + ", cantidadBanios = " + cantidadBanios + ", poseeRestaurante = " + poseeRestaurante + "\n";
    }

    
    
    
}
