package Ejercicio_Extra1;

public final class Velero extends Barco {

    private int cantMastil;

    public Velero(String matricula, double eslora, int anioFabricacion, String nombreNavio, int cantMastil) {
        super(matricula, eslora, anioFabricacion, nombreNavio);
        this.cantMastil = cantMastil;
    }

    public int getCantMastil() {
        return cantMastil;
    }

    public void setCantMastil(int cantMastil) {
        this.cantMastil = cantMastil;
    }

    @Override
    public double calcularModulo() {

        return super.calcularModulo() + cantMastil;

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " cantidad mastil: " + cantMastil;

    }

}
