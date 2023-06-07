package Ejercicio_Extra2;

import java.util.Scanner;

public final class EdificioDeOficinas extends Edificio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int numOficinas;
    private int cantidadPersonas;
    private int numPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int numOficinas, int cantidadPersonas, int numPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.cantidadPersonas = cantidadPersonas;
        this.numPisos = numPisos;
    }

    public int getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(int numOficinas) {
        this.numOficinas = numOficinas;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    @Override
    public void calcularSuperficie() {
        double superficie;
        superficie = super.ancho * super.largo;
        System.out.println("La superficie total del edificio de las oficinas es: " + superficie);
    }

    @Override
    public void calcularVolumen() {
        double volumen;
        volumen = super.ancho * super.largo * super.alto;
        System.out.println("El volumen total del edificio de las oficinas es: " + volumen);
    }

    public void cantPersonas() {
        if (numPisos > 1 && numOficinas > 1) {
            int personasPorPiso = numOficinas * cantidadPersonas;
            int edificioCompleto = personasPorPiso * numPisos;
            System.out.println("La cantidad de personas por piso es: " + personasPorPiso);
            System.out.println("La cantidad total de todas las personas en las oficinas es: " + edificioCompleto);
        } else {
            if (numPisos < 1) {
                System.out.println("El numero de pisos tiene que ser mayor a uno ingreselo nuevamente: ");
                numPisos = leer.nextInt();
            }
            if (numOficinas < 1) {
                System.out.println("El numero de oficinas tiene que ser mayor a uno ingreselo nuevamente: ");
                numOficinas = leer.nextInt();
            }
            if (numPisos < 1 && numOficinas < 1) {
                System.out.println("El numero de pisos tiene que ser mayor a uno ingreselo nuevamente: ");
                numPisos = leer.nextInt();
                System.out.println("El numero de oficinas tiene que ser mayor a uno ingreselo nuevamente: ");
                numOficinas = leer.nextInt();
            }
        }
    }

    @Override
    public String toString() {
        return "Edificio de las oficinas: " + "cantidad de oficinas = " + numOficinas + "\n cantidad de personas = " + cantidadPersonas + "\n cantidad de pisos = " + numPisos;
    }

}
