package classes;

public class Pan extends HidratosDeCarbono implements Consumible, Conservable, Preparable{
    private String tipoHarina;
    private boolean esIntegral;

    public Pan(String nombre, double calorias, double pesoPorPorcion, String unidadMedida, String tipoHarina,
               boolean esIntegral) {
        super(nombre, calorias, pesoPorPorcion, unidadMedida);
        this.tipoHarina = tipoHarina;
        this.esIntegral = esIntegral;
    }

    @Override
    public void consumir() {
        System.out.println("Comiendo pan hecho con harina: " + tipoHarina + (esIntegral ? " integral." : " refinada."));
    }

    @Override
    public void preparar(String metodo) {
        System.out.println("Preparando pan con el método: " + metodo);
    }

    @Override
    public void almacenar(String condiciones) {
        System.out.println("El pan debe almacenarse en condiciones: " + condiciones);
    }

    @Override
    public int tiempoDeConservacion() {
        return 5; // Shelf life in days
    }

    @Override
    public String obtenerInformacionNutricional() {
        return super.obtenerInformacionNutricional() + ", Tipo de Harina: " + tipoHarina + ", Es Integral: " + esIntegral;
    }

    @Override
    public String toString() {
        return obtenerInformacionNutricional();
    }
}
