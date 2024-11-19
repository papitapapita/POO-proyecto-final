package classes;

import javax.swing.*;

public class Tomate extends FrutasVerduras implements Consumible, Conservable, Preparable{
    private String tipo;

    public Tomate(String nombre, double calorias, double pesoPorPorcion, String unidadMedida, String tipo) {
        super(nombre, calorias, pesoPorPorcion, unidadMedida);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void consumir() {
        JOptionPane.showMessageDialog(null, "Comiendo un tomate de tipo: " + tipo);
    }

    @Override
    public void almacenar(String condiciones) {
        JOptionPane.showMessageDialog(null, "El tomate debe almacenarse en condiciones: " + condiciones);
    }

    @Override
    public int tiempoDeConservacion() {
        return 10; // Shelf life in days
    }

    @Override
    public void preparar(String metodo) {
        JOptionPane.showMessageDialog(null, "Preparando tomate con el método: " + metodo);
    }

    @Override
    public String obtenerInformacionNutricional() {
        return super.obtenerInformacionNutricional() + ", Tipo: " + tipo;
    }

    @Override
    public String toString() {
        return obtenerInformacionNutricional();
    }
}
