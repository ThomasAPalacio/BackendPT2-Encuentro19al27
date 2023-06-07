package Ejercicio_Extra1;

public final class Yate extends Barco {

    private double potenciaCV;
    private int cantCamarote;

    public Yate(String matricula, double eslora, int anioFabricacion, String nombreNavio, double potenciaCV,
            int cantCamarote) {
        super(matricula, eslora, anioFabricacion, nombreNavio);
        this.potenciaCV = potenciaCV;
        this.cantCamarote = cantCamarote;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getCantCamarote() {
        return cantCamarote;
    }

    public void setCantCamarote(int cantCamarote) {
        this.cantCamarote = cantCamarote;
    }

    @Override
    public double calcularModulo() {

        return super.calcularModulo() + potenciaCV + cantCamarote;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Potencia Cv: " + potenciaCV + " Cantidad de camarotes: " + cantCamarote;
    }

}
