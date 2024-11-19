package classes;

public abstract class FrutasVerduras extends Alimento {

    public FrutasVerduras(String nombre, double calorias, double pesoPorPorcion, String unidadMedida) {
        super(nombre, "Frutas y Verduras", calorias, pesoPorPorcion, unidadMedida);
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
