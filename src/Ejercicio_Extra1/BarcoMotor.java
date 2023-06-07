package Ejercicio_Extra1;

public final class BarcoMotor extends Barco {

    private double potenciaCV;

    public BarcoMotor(String matricula, double eslora, int anioFabricacion, String nombreNavio, double potenciaCV) {
        super(matricula, eslora, anioFabricacion, nombreNavio);
        this.potenciaCV = potenciaCV;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public double calcularModulo() {

        return super.calcularModulo() + potenciaCV;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Potencia Cv: " + potenciaCV;
    }
}
