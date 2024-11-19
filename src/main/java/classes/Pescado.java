package classes;

public class Pescado extends Grasas implements Consumible, Conservable, Preparable{
    private String especie;
    private boolean esDeAguaSalada;

    public Pescado(String nombre, double calorias, double pesoPorPorcion, String unidadMedida,
                   double contenidoGrasaTotal, String especie, boolean esDeAguaSalada) {
        super(nombre, calorias, pesoPorPorcion, unidadMedida, contenidoGrasaTotal);
        this.especie = especie;
        this.esDeAguaSalada = esDeAguaSalada;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean getEsDeAguaSalada() {
        return esDeAguaSalada;
    }

    public void setEsDeAguaSalada(boolean esDeAguaSalada) {
        this.esDeAguaSalada = esDeAguaSalada;
    }

    @Override
    public void consumir() {
        System.out.println("Comiendo pescado de especie: " + especie + (esDeAguaSalada ? " de agua salada." : " de agua dulce."));
    }

    @Override
    public void almacenar(String condiciones) {
        System.out.println("El pescado debe almacenarse en condiciones: " + condiciones);
    }

    @Override
    public int tiempoDeConservacion() {
        return 3; // Shelf life in days
    }

    @Override
    public void preparar(String metodo) {
        System.out.println("Preparando pescado con el método: " + metodo);
    }

    @Override
    public String obtenerInformacionNutricional() {
        return super.obtenerInformacionNutricional() + ", Especie: " + especie + ", Es de Agua Salada: " + esDeAguaSalada;
    }

    @Override
    public String toString() {
        return obtenerInformacionNutricional();
    }
}
