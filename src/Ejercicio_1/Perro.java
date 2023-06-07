package Entidades;

public class Perro extends Animal {
    public Perro() {
    }

    public Perro(String nombre, String alimento, Integer edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }

    @Override
    public void alimentarse() {
        super.alimentarse();
        System.out.println("Soy un perro comiendo dogui");
    }
}
