package sistemaTicketet;

public class Teatro extends Sede {
    
	
	public Teatro(String nombre, String direccion, int capacidad) {
        super(nombre, direccion, capacidad);
    }

    @Override
    public String obtenerTipo() {
        return "Teatro";
    }

    @Override
    public double calcularPrecioEntrada(Sector sector, double precioBase) {
        return sector.calcularPrecio(precioBase);
    }
}

