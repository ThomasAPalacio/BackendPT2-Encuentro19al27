package Entidades;

public class Animal {
    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String razaAnimal;

    public Animal() {
    }

    public Animal(String nombre, String alimento, Integer edad, String razaAnimal) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.razaAnimal = razaAnimal;
    }
    /*Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:*/
    public void alimentarse() {
        System.out.println("Me estoy alimentando");

    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", alimento='" + alimento + '\'' +
                ", edad=" + edad +
                ", razaAnimal='" + razaAnimal + '\'' +
                '}';
    }
}
