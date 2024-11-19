package classes;

public class Pasta extends HidratosDeCarbono implements Consumible, Preparable{
    private String forma;

    public Pasta(String nombre, double calorias, double pesoPorPorcion, String unidadMedida, String forma) {
        super(nombre, calorias, pesoPorPorcion, unidadMedida);
        this.forma = forma;
    }

    public String getforma() {
        return forma;
    }

    public void setforma(String forma) {
        this.forma = forma;
    }

    @Override
    public void consumir() {
        System.out.println("Comiendo pasta en forma de: " + forma);
    }

    @Override
    public void preparar(String metodo) {
        System.out.println("Cocinando pasta con el método: " + metodo);
    }

    @Override
    public String obtenerInformacionNutricional() {
        return super.obtenerInformacionNutricional() + ", Forma: " + forma;
    }

    @Override
    public String toString() {
        return obtenerInformacionNutricional();
    }
}
