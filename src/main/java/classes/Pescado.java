package classes;

public class Pescado extends Grasas implements Consumible, Conservable, Preparable{
    private String especie;

    public Pescado(double calorias, double pesoPorPorcion, String unidadMedida, String especie) {
        super("Pescado", calorias, pesoPorPorcion, unidadMedida);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public void consumir() {
        System.out.println("Comiendo pescado de especie: " + especie);
    }

    @Override
    public void almacenar(String condiciones) {
        System.out.println("El pescado debe almacenarse en condiciones: " + condiciones);
    }

    @Override
    public int tiempoDeConservacion() {
        return 3; // Shelf life in days
    }

    @Override
    public void preparar(String metodo) {
        System.out.println("Preparando pescado con el método: " + metodo);
    }

    @Override
    public String obtenerInformacionNutricional() {
        return super.obtenerInformacionNutricional() + ", Especie: " + especie;
    }

    @Override
    public String toString() {
        return obtenerInformacionNutricional();
    }
}
