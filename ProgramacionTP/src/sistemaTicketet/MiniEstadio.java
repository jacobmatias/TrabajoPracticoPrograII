package sistemaTicketet;

public class MiniEstadio extends Sede {
    private int cantPuestosComida;
    private int cantPuestosMerchandising;
    private double consumoIncluido;

    public MiniEstadio(String nombre, String direccion, int capacidad,int cantPuestosComida, int cantPuestosMerchandising, double consumoIncluido) {
        super(nombre, direccion, capacidad);
        this.cantPuestosComida = cantPuestosComida;
        this.cantPuestosMerchandising = cantPuestosMerchandising;
        this.consumoIncluido = consumoIncluido;
    }

    @Override
    public String obtenerTipo() {
        return "MiniEstadio";
    }

    @Override
    public double calcularPrecioEntrada(Sector sector, double precioBase) {
        return sector.calcularPrecio(precioBase) + consumoIncluido;
    }
    
    public int obtenerCantPuestosComida() {
    	return cantPuestosComida;
    }
    
    public int obtenerCantPuestosMerchadising() {
    	return cantPuestosMerchandising;
    }
}