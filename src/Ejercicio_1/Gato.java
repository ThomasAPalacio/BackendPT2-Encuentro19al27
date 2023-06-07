package Entidades;

public class Gato extends Animal  {

    public Gato() {
    }

    public Gato(String nombre, String alimento, Integer edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }

    @Override
    public void alimentarse() {
        super.alimentarse();
        System.out.println("Soy un gato comiendo gati");
    }
}
