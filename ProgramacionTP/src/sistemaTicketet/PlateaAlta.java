package sistemaTicketet;

public class PlateaAlta extends Sector {

    public PlateaAlta(int numero, int capacidad) {
        super(numero, capacidad);
    }

    @Override
    public String obtenerTipo() {
        return "Platea Alta";
    }

	@Override
	public double calcularPrecio(double precioBase) {
		// TODO Auto-generated method stub
		return 0;
	}
}