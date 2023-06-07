package Ejercicio_Extra3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class AlojamientoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void menu(ArrayList<Alojamiento> alojamientoArrayList) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int menu;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Todos los alojamientos");
            System.out.println("2. Todos los hoteles de más caro a más barato");
            System.out.println("3. Todos los campings con restaurante");
            System.out.println("4. Todos las residencias que tienen descuento");
            System.out.println("5. Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1 -> {
                    System.out.println("Todos los alojamientos");
                    mostrarAlojamientos(alojamientoArrayList);
                }
                case 2 -> {
                    System.out.println("Todos los hoteles de más caro a más barato");
                    hotelesMasCarosAMasBaratos(alojamientoArrayList);
                }
                case 3 -> {
                    System.out.println("Todos los campings con restaurante");
                    campingsConRestaurante(alojamientoArrayList);
                }
                case 4 -> {
                    System.out.println("Todos las residencias que tienen descuento");
                    residenciasConDescuento(alojamientoArrayList);
                }
                case 5 ->
                    System.out.println("Saliendo...");
                default ->
                    System.out.println("Opcion no valida");
            }
        } while (menu != 5);
    }

    private void residenciasConDescuento(ArrayList<Alojamiento> alojamientoArrayList) {
        for (Alojamiento alojamiento : alojamientoArrayList) {
            if (alojamiento instanceof Residencia) {
                if (((Residencia) alojamiento).isDescuentos()) {
                    System.out.println(alojamiento.getNombre());
                }
            }
        }
    }

    private void campingsConRestaurante(ArrayList<Alojamiento> alojamientoArrayList) {
        for (Alojamiento alojamiento : alojamientoArrayList) {
            if (alojamiento instanceof Camping) {
                if (((Camping) alojamiento).isPoseeRestaurante()) {
                    System.out.println(alojamiento.getNombre());
                }
            }
        }
    }

    private void hotelesMasCarosAMasBaratos(ArrayList<Alojamiento> alojamientoArrayList) {
        ArrayList<Hoteles> hoteles = new ArrayList<>();
        for (Alojamiento alojamiento : alojamientoArrayList) {
            if (alojamiento instanceof Hoteles) {
                hoteles.add((Hoteles) alojamiento);
            }
        }
        hoteles.sort(Comparator.comparing(Hoteles::getPrecioHabitaciones).reversed());
        for (Hoteles hotel : hoteles) {
            System.out.println("*************************");
            System.out.println("Nombre Hotel:\n" + hotel.getNombre());
            System.out.println("Precio Habitaciones:\n" + hotel.getPrecioHabitaciones());

        }
    }

    private void mostrarAlojamientos(ArrayList<Alojamiento> alojamientoArrayList) {
        for (Alojamiento alojamiento : alojamientoArrayList) {
            System.out.println(alojamiento.getNombre());
        }
    }
}
