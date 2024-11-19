
package classes;


public abstract class Grasas extends Alimento {
    private double contenidoGrasaTotal;

    public Grasas(String nombre, double calorias, double pesoPorPorcion, String unidadMedida, double contenidoGrasaTotal) {
        super(nombre, "Grasas", calorias, pesoPorPorcion, unidadMedida);
        this.contenidoGrasaTotal = contenidoGrasaTotal;
    }

    public double getContenidoGrasaTotal() {
        return contenidoGrasaTotal;
    }

    public void setContenidoGrasaTotal(double contenidoGrasaTotal) {
        this.contenidoGrasaTotal = contenidoGrasaTotal;
    }

    @Override
    public String obtenerInformacionNutricional() {
        return super.toString() + ", Contenido Grasa Total: " + contenidoGrasaTotal + "g";
    }

    @Override
    public String toString() {
        return obtenerInformacionNutricional();
    }
}
