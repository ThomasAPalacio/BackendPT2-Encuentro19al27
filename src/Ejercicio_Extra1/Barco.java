package Ejercicio_Extra1;

public class Barco implements IBarco {

    protected String matricula;
    protected double eslora;
    protected int anioFabricacion;
    protected String nombreNavio;

    public Barco(String matricula, double eslora, int anioFabricacion, String nombreNavio) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
        this.nombreNavio = nombreNavio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public String getNombreNavio() {
        return nombreNavio;
    }

    public void setNombreNavio(String nombreNavio) {
        this.nombreNavio = nombreNavio;
    }

    @Override
    public double calcularModulo() {
        return eslora * 10;
    }

    @Override
    public String toString() {
        return "Barco [matricula=" + matricula + ", eslora=" + eslora + ", anioFabricacion=" + anioFabricacion
                + ", nombreNavio=" + nombreNavio + "]";
    }

}
