package Ejercicio_Extra1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AlquilerServicio {

    private Scanner scann = new Scanner(System.in);

    public Velero crearVelero() {
        System.err.println("Ingrese numero de matricula: ");
        String chapa = scann.nextLine();
        scann.nextLine();
        System.out.println("Ingrese en metros el tamaño de la eslora: ");
        double esloraMts = scann.nextInt();

        System.out.println("Ingrese año de fabricacion: ");
        int anioFabric = scann.nextInt();

        System.out.println("Nombre del navio: ");
        String name = scann.nextLine();
        scann.nextLine();

        System.out.println("Ingrese cantidad de mastiles: ");
        int cantMastiles = scann.nextInt();

        return new Velero(chapa, esloraMts, anioFabric, name, cantMastiles);

    }

    public BarcoMotor crearBarcoMotor() {
        System.err.println("Ingrese numero de matricula: ");
        String chapa = scann.nextLine();
        scann.nextLine();

        System.out.println("Ingrese en metros el tamaño de la eslora: ");
        double esloraMts = scann.nextDouble();

        System.out.println("Ingrese año de fabricacion: ");
        int anioFabric = scann.nextInt();

        System.out.println("Nombre del navio: ");
        String name = scann.nextLine();
        scann.nextLine();
        System.out.println("Ingrese la pontencia en CV: ");
        double potencia = scann.nextDouble();

        return new BarcoMotor(chapa, esloraMts, anioFabric, name, potencia);
    }

    public Yate crearYate() {
        System.err.println("Ingrese numero de matricula: ");
        String chapa = scann.nextLine();
        scann.nextLine();
        System.out.println("Ingrese en metros el tamaño de la eslora: ");
        double esloraMts = scann.nextInt();

        System.out.println("Ingrese año de fabricacion: ");
        int anioFabric = scann.nextInt();

        System.out.println("Nombre del navio: ");
        String name = scann.nextLine();
        scann.nextLine();
        System.out.println("Ingrese la pontencia en CV: ");
        double potencia = scann.nextDouble();

        System.out.println("Ingrese cantidad de camarotes: ");
        int cantCamarotes = scann.nextInt();

        return new Yate(chapa, esloraMts, anioFabric, name, potencia, cantCamarotes);

    }

    public List<Barco> crearMenu() {
        List<Barco> listaBarco = new LinkedList<>();

        System.out.println("Bienvenido al sistema de alquileres de barcos!");
        System.out.println("=============== Agregar navios ===================");
        int op;
        do {
            System.out.println("Por favor selecciones el barco que desea agregar: ");
            System.out.println("1-Velero.");
            System.out.println("2-Barco con motor.");
            System.out.println("3-Yate.");
            System.out.println("4-Salir.");
            op = scann.nextInt();

            switch (op) {
                case 1:
                    //listaBarco.add(crearVelero());

                    precioFinalAlquiler(crearAlquiler(crearVelero()));
                    System.out.println("===============================");
                    break;
                case 2:
                    //listaBarco.add(crearBarcoMotor());
                    precioFinalAlquiler(crearAlquiler(crearBarcoMotor()));

                    System.out.println("===============================");
                    break;
                case 3:
                    //listaBarco.add(crearYate());

                    precioFinalAlquiler(crearAlquiler(crearYate()));
                    System.out.println("===============================");
                    break;
                case 4:
                    System.out.println("Terminar agregado.");

                    break;
            }
            System.out.println("===============================");
        } while (op != 4);
        return listaBarco;

    }

    public void alquilerMenu(List<Barco> lista) {
        System.out.println("Los barcos disponibles son:");
        int i = 1;
        for (Barco auxBarco : lista) {
            if (auxBarco instanceof Velero) {
                System.out.println((i++) + " " + auxBarco.toString() + " Valor de alquiler: " + auxBarco.calcularModulo());
            } else if (auxBarco instanceof BarcoMotor) {
                System.out.println((i++) + " " + auxBarco.toString() + " Valor de alquiler: " + auxBarco.calcularModulo());
            } else if (auxBarco instanceof Yate) {
                System.out.println((i++) + " " + auxBarco.toString() + " Valor de alquiler: " + auxBarco.calcularModulo());
            }
        }
    }

    public Alquiler crearAlquiler(Barco barco) {
        scann.nextLine();
        System.out.println("Ingrese nombre del cliente:");
        String nombre = scann.nextLine();

        System.out.println("Ingrese dni del cliente: ");
        String dni = scann.next();

        System.out.println("Ingrese fecha de  inicio alquiler: ");
        String fechaAlquiler = scann.next();
        DateTimeFormatter fechaFormato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dataInicio = LocalDate.parse(fechaAlquiler, fechaFormato);

        System.out.println("Ingrese fecha de alquiler: ");
        String fechaFin = scann.next();
        LocalDate dataFin = LocalDate.parse(fechaFin, fechaFormato);

        System.out.println("Indique posicion de amarre: ");
        String posAmarre = scann.next();

        return new Alquiler(nombre, dni, dataInicio, dataFin, posAmarre, barco);

    }

    public void precioFinalAlquiler(Alquiler alquiler1) {
        System.out.println("El precio de la amarra por para el tipo de barco ingresado por los dias de ocupacion es de :");
        System.out.println(alquiler1.calcularDias() * alquiler1.getBarco().calcularModulo());

    }

}
