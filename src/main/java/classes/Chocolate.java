package classes;

public class Chocolate extends Grasas implements Consumible, Preparable{
    private double porcentajeCacao;

    public Chocolate(String nombre, double calorias, double pesoPorPorcion, String unidadMedida,
                     double contenidoGrasaTotal, double porcentajeCacao) {
        super(nombre, calorias, pesoPorPorcion, unidadMedida, contenidoGrasaTotal);
        this.porcentajeCacao = porcentajeCacao;
    }

    public double getPorcentajeCacao() {
        return porcentajeCacao;
    }

    public void setPorcentajeCacao(double porcentajeCacao) {
        this.porcentajeCacao = porcentajeCacao;
    }

    @Override
    public void consumir() {
        System.out.println("Comiendo un chocolate con " + porcentajeCacao + "% de cacao.");
    }

    @Override
    public void preparar(String metodo) {
        System.out.println("Preparando chocolate con el método: " + metodo);
    }

    @Override
    public String obtenerInformacionNutricional() {
        return super.obtenerInformacionNutricional() + ", Porcentaje de Cacao: " + porcentajeCacao + "%";
    }

    @Override
    public String toString() {
        return obtenerInformacionNutricional();
    }
}
