package classes;

public abstract class Alimento {
    String nombre;
    String grupo;
    double calorias;
    double pesoPorPorcion;
    String unidadMedida;

    public Alimento(String nombre, String grupo, double calorias, double pesoPorPorcion, String unidadMedida) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.calorias = calorias;
        this.pesoPorPorcion = pesoPorPorcion;
        this.unidadMedida = unidadMedida;
    }

    public abstract String obtenerInformacionNutricional();

    double calcularCalorias(double cantidad) {
        return (cantidad / pesoPorPorcion) * calorias;
    }

    boolean esSaludable() {
        return calorias <= 200;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getPesoPorPorcion() {
        return pesoPorPorcion;
    }

    public void setPesoPorPorcion(double pesoPorPorcion) {
        this.pesoPorPorcion = pesoPorPorcion;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Grupo: " + grupo + ", Calorías: " + calorias +
                ", Peso por porción: " + pesoPorPorcion + " " + unidadMedida;
    }
}
