package Ejercicio_2y3;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private int resolucion;
    private boolean decodificador;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean decodificador, int precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.decodificador = decodificador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isDecodificador() {
        return decodificador;
    }

    public void setDecodificador(boolean decodificador) {
        this.decodificador = decodificador;
    }

    public void crearTV() {
        super.crearElectrodomestico();
        System.out.println("Ingrese la resolucion en pulgadas para su TV: ");
        resolucion = leer.nextInt();
        System.out.println("Quiere un decodificador? (S/N)");
        String opcion = leer.next();
        if (opcion.equalsIgnoreCase("S")) {
            decodificador = true;
        }
        if (opcion.equalsIgnoreCase("N")) {
            decodificador = false;
        }
    }

    public void precioFinalTV() {
        super.PrecioFinalElectrodemoestico();
        if (resolucion > 40 && decodificador) {
            precio *= 1.30;
            precio += 500;
        }
    }

   @Override
    public String toString() {
        return "Televisor{" +
                "pulgadas=" + resolucion +
                ", sintonizadorTDT=" + decodificador +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", consumoEnergetico=" + consumoEnergetico +
                '}';
    }
}
