package classes;

public class Queso extends Grasas implements Consumible, Conservable, Preparable{
    private String tipo;
    private boolean estaMaduro;

    public Queso(double calorias, double pesoPorPorcion, String unidadMedida, String tipo, boolean estaMaduro) {
        super("Queso", calorias, pesoPorPorcion, unidadMedida);
        this.tipo = tipo;
        this.estaMaduro = estaMaduro;
    }

    @Override
    public void consumir() {
        System.out.println("Comiendo queso de tipo: " + tipo + (estaMaduro ? " maduro." : " fresco."));
    }

    @Override
    public void almacenar(String condiciones) {
        System.out.println("El queso debe almacenarse en condiciones: " + condiciones);
    }

    @Override
    public int tiempoDeConservacion() {
        return 15;
    }

    @Override
    public void preparar(String metodo) {
        System.out.println("Preparando queso con el método: " + metodo);
    }

    @Override
    public String obtenerInformacionNutricional() {
        return super.obtenerInformacionNutricional() + ", Tipo: " + tipo + ", Está Maduro: " + estaMaduro;
    }

    @Override
    public String toString() {
        return obtenerInformacionNutricional();
    }
}
