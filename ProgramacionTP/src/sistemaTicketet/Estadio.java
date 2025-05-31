package sistemaTicketet;

public class Estadio extends Sede {
    private double precioCampo;

    public Estadio(String nombre, String direccion, int capacidad, double precioCampo) {
        super(nombre, direccion, capacidad);
        this.precioCampo = precioCampo;
    }

    @Override
    public String obtenerTipo() {
        return "Estadio";
    }

    @Override
    public double calcularPrecioEntrada(Sector sector, double precioBase) {
        if (sector.obtenerTipo().equals("Campo")) {
            return precioCampo;
        }
        return sector.calcularPrecio(precioBase);
    }
}