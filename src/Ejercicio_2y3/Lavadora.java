package Ejercicio_2y3;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private int carga;

    public Lavadora() {
    }

    public Lavadora(int precio, String color, char consumoEnergetico, double peso, int carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        super.crearElectrodomestico();
        System.out.println("Ingrese la carga:");
        carga = leer.nextInt();
    }

    
    public void precioFinalLavadora() {
        super.PrecioFinalElectrodemoestico();
        if (carga > 30) {
            precio += 500;
        }
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                ", precio=" + precio +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                ", consumoEnergetico=" + consumoEnergetico +
                '}';
    }

}
