package Ejercicio_Extra3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Hotel5Estrellas extends Hotel4Estrellas {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    protected int cantidadSalonesConferencia;
    protected int cantidadSuites;
    protected int cantidadLimosinas;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(int cantidadSalonesConferencia, int cantidadSuites, int cantidadLimosinas, String tipoGimnasio, String nombreRestaurante, int capacidadRestaurante, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(tipoGimnasio, nombreRestaurante, capacidadRestaurante, cantidadHabitaciones, numeroCamas, cantidadPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public int getCantidadSalonesConferencia() {
        return cantidadSalonesConferencia;
    }

    public void setCantidadSalonesConferencia(int cantidadSalonesConferencia) {
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
    }

    public int getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(int cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(int cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }

    /*public Hotel5Estrellas crearHotel5Estrellas() {
            System.out.println("*Creando Hotel 5 Estrellas*");
            System.out.println("Nombre del Hotel:");
            this.nombre = leer.next();
            System.out.println("Dirección del Hotel:");
            this.direccion = leer.next();
            System.out.println("Localidad del Hotel:");
            this.localidad = leer.next();
            System.out.println("Gerente del Hotel:");
            this.gerente = leer.next();
            System.out.println("Cantidad de Habitaciones:");
            this.cantidadHabitaciones = leer.nextInt();
            System.out.println("Número de Camas:");
            this.numeroCamas = leer.nextInt();
            System.out.println("Cantidad de Pisos:");
            this.cantidadPisos = leer.nextInt();
            System.out.println("Precio de las Habitaciones:");
            this.precioHabitaciones = leer.nextDouble();
            System.out.println("Tipo de Gimnasio: A/B");
            this.tipoGimnasio = leer.next().toUpperCase();
            System.out.println("Nombre del Restaurante:");
            this.nombreRestaurante = leer.next();
            System.out.println("Capacidad del Restaurante:");
            this.capacidadRestaurante = leer.nextInt();
            System.out.println("Cantidad Salones de Conferencia:");
            this.cantidadSalonesConferencia = leer.nextInt();
            System.out.println("Cantidad Suites:");
            this.cantidadSuites = leer.nextInt();
            System.out.println("Cantidad Limosinas:");
            this.cantidadLimosinas = leer.nextInt();
            calcularPrecioHabitacion();
            return this;
     */
    @Override
    public void calcularPrecioHabitacion() {
        super.calcularPrecioHabitacion();
        this.precioHabitaciones = (15 * this.cantidadLimosinas);
    }

    @Override
    public String toString() {
        return super.toString() + "Hotel5Estrellas: " + "cantidadSalonesConferencia = " + cantidadSalonesConferencia + ", cantidadSuites = " + cantidadSuites + ", cantidadLimosinas = " + cantidadLimosinas + "\n";
    }

}
