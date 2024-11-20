package classes;

import javax.swing.*;

public class Aceite extends Grasas implements Consumible, Conservable{
    private String tipoAceite;

    public Aceite(double calorias, double pesoPorPorcion, String unidadMedida, String tipoAceite) {
        super("Aceite", calorias, pesoPorPorcion, unidadMedida);
        this.tipoAceite = tipoAceite;
    }

    public String getTipoAceite() {
        return tipoAceite;
    }

    public void setTipoAceite(String tipoAceite) {
        this.tipoAceite = tipoAceite;
    }

    @Override
    public void consumir() {
        JOptionPane.showMessageDialog(null,
                "Usando aceite de tipo: " + tipoAceite + " para consumo."
        );
    }

    @Override
    public void almacenar(String condiciones) {
        JOptionPane.showMessageDialog(null,"El aceite debe almacenarse en: " + condiciones);
    }

    @Override
    public int tiempoDeConservacion() {
        return 365;
    }

    @Override
    public String obtenerInformacionNutricional() {
        return super.obtenerInformacionNutricional() + ", Tipo: " + tipoAceite;
    }

    @Override
    public String toString() {
        return obtenerInformacionNutricional();
    }
}
