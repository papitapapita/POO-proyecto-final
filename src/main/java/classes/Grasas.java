
package classes;


public abstract class Grasas extends Alimento {
    public Grasas(String nombre, double calorias, double pesoPorPorcion, String unidadMedida) {
        super(nombre, "Grasas", calorias, pesoPorPorcion, unidadMedida);
    }

    @Override
    public String obtenerInformacionNutricional() {
        return super.toString();
    }

    @Override
    public String toString() {
        return obtenerInformacionNutricional();
    }
}
