package classes;

import javax.swing.*;

public class Uva extends FrutasVerduras implements Consumible, Conservable{
    private String tipo;
    private boolean tieneSemillas;

    public Uva(String nombre, double calorias, double pesoPorPorcion, String unidadMedida, String tipo, boolean tieneSemillas) {
        super(nombre, calorias, pesoPorPorcion, unidadMedida);
        this.tipo = tipo;
        this.tieneSemillas = tieneSemillas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isTieneSemillas() {
        return tieneSemillas;
    }

    public void setTieneSemillas(boolean tieneSemillas) {
        this.tieneSemillas = tieneSemillas;
    }

    @Override
    public void consumir() {
        JOptionPane.showMessageDialog(null, "Comiendo uvas de tipo: " + tipo + (tieneSemillas ? " sin semillas." : " con semillas."));
    }

    @Override
    public void almacenar(String condiciones) {
        JOptionPane.showMessageDialog(null, "Las uvas deben almacenarse en condiciones: " + condiciones);
    }

    @Override
    public int tiempoDeConservacion() {
        return 5; // Shelf life in days
    }

    @Override
    public String obtenerInformacionNutricional() {
        return super.obtenerInformacionNutricional() + ", Tipo: " + tipo + ", Es Sin Semillas: " + tieneSemillas;
    }
}

