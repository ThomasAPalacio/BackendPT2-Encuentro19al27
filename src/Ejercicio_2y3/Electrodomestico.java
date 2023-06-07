package Ejercicio_2y3;

import java.util.Scanner;

public class Electrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected int precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char letra) {

        if (letra >= 'A' || letra <= 'F') {
//            De char a String
//            consumoEnergetico = Character.toString(letra);
            consumoEnergetico = letra;
        } else {
            consumoEnergetico = 'F';
        }

//        if (letra == 'A') {
//            consumoEnergetico = "A";
//        } else if (letra == 'B') {
//            consumoEnergetico = "B";
//        } else if (letra == 'C') {
//            consumoEnergetico = "C";
//        } else if (letra == 'D') {
//            consumoEnergetico = "D";
//        } else if (letra == 'E') {
//            consumoEnergetico = "E";
//        } else if (letra == 'F') {
//            consumoEnergetico = "F";
//        } else {
//            consumoEnergetico = "F";
//        }
    }

    public void comprobarColor(String color) {
        for (Colores aux : Colores.values()) {
            if (aux.getColores().equalsIgnoreCase(color)) {
                this.color = color;
            } else {
                this.color = "Blanco";
            }
        }
    }

    public void crearElectrodomestico() {
        precio = 1000;
        System.out.println("Ingrese el color que quiera del Electrodomestico:");
        String color = leer.next();
        comprobarColor(color);
        System.out.println("Ingrese un tipo de consumo (A/B/C/D/E/F): ");
        char letra = leer.next().charAt(0);
        comprobarConsumoEnergetico(letra);
        System.out.println("Ingrese el peso del producto: ");
        peso = leer.nextInt();
        if (peso > 0 && peso < 20) {
            this.precio += 100;
        } else if (peso >= 20 && peso < 50) {
            this.precio += 500;
        } else if (peso >= 50 && peso < 80) {
            this.precio += 800;
        } else if (peso >= 80) {
            this.precio += 1000;
        }

    }

    public void PrecioFinalElectrodemoestico() {
        switch (consumoEnergetico) {
            case 'A':
                precio += 1000;
                break;
            case 'B':
                precio += 800;
                break;
            case 'C':
                precio += 600;
                break;
            case 'D':
                precio += 500;
                break;
            case 'E':
                precio += 300;
                break;
            case 'F':
                precio += 100;
                break;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico: " + "precio = " + precio
                + ", color = " + color + ", consumoEnergetico = "
                + consumoEnergetico + ", peso = " + peso;
    }

}
