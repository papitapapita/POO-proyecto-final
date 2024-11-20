package classes;

import javax.swing.*;

public class Papa extends HidratosDeCarbono implements Conservable, Consumible, Preparable{
    private String variedad;

    public Papa(double calorias, double pesoPorPorcion, String unidadMedida, String variedad) {
        super("Papa", calorias, pesoPorPorcion, unidadMedida);
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
        JOptionPane.showMessageDialog(null, "Comiendo una papa de variedad: " + variedad);
    }

    @Override
    public void almacenar(String condiciones) {
        JOptionPane.showMessageDialog(null, "Las papas deben almacenarse en condiciones: " + condiciones);
    }

    @Override
    public void preparar(String metodo) {
        System.out.println("Preparando papa con el método: " + metodo);
    }

    @Override
    public int tiempoDeConservacion() {
        return 30; // Shelf life in days
    }

    @Override
    public String obtenerInformacionNutricional() {
        return super.obtenerInformacionNutricional() + ", Variedad: " + variedad;
    }
}
