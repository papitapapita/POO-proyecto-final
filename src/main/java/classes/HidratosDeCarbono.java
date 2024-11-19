package classes;

public abstract class HidratosDeCarbono extends Alimento {

    public HidratosDeCarbono(String nombre, double calorias, double pesoPorPorcion, String unidadMedida) {
        super(nombre, "Hidratos de Carbono", calorias, pesoPorPorcion, unidadMedida);
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
