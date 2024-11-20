package classes;

import javax.swing.*;

public class Manzana extends FrutasVerduras implements Consumible, Conservable {
    private String variedad;

    public Manzana(double calorias, double pesoPorPorcion, String unidadMedida, String variedad) {
        super("Manzana", calorias, pesoPorPorcion, unidadMedida);
        this.variedad = variedad;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    @Override
    public String toString() {
        return obtenerInformacionNutricional();
    }

    @Override
    public void consumir() {
        JOptionPane.showMessageDialog(null, "Comiendo una manzana de variedad: " + variedad);
    }

    @Override
    public void almacenar(String condiciones) {
        JOptionPane.showMessageDialog(null, "Las manzanas deben almacenarse en condiciones: " + condiciones);
    }

    @Override
    public int tiempoDeConservacion() {
        return 15;
    }

    @Override
    public String obtenerInformacionNutricional() {
        return super.obtenerInformacionNutricional() + ", Variedad: " + variedad;
    }
}
