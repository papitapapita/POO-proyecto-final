package classes;

import javax.swing.*;

public class Aguacate extends FrutasVerduras implements Consumible, Conservable{
    private String variedad;

    public Aguacate(double calorias, double pesoPorPorcion, String unidadMedida, String variedad) {
        super("Aguacate", calorias, pesoPorPorcion, unidadMedida);
        this.variedad = variedad;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    @Override
    public void consumir() {
        JOptionPane.showMessageDialog(null,"Comiendo un aguacate de variedad: " + variedad);
    }

    @Override
    public void almacenar(String condiciones) {
        JOptionPane.showMessageDialog(null,"El aguacate debe almacenarse en condiciones: " + condiciones);
    }

    @Override
    public int tiempoDeConservacion() {
        return 7;
    }

    @Override
    public String obtenerInformacionNutricional() {
        return super.obtenerInformacionNutricional() + ", Variedad: " + variedad;
    }

    @Override
    public String toString() {
        return obtenerInformacionNutricional();
    }
}
