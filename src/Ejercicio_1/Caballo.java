package Entidades;

import java.sql.SQLOutput;

public class Caballo extends Animal {
    public Caballo(String nombre, String alimento, Integer edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }


    @Override
    public void alimentarse() {
        super.alimentarse();
        System.out.println("Soy un caballo comiendo pasto");
    }
}
