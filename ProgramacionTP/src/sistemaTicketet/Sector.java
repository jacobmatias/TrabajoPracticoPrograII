package sistemaTicketet;

import java.util.HashMap;

public abstract class Sector {

	private int numero;
	private int cantidadAsientos;
	private HashMap<Integer,Boolean> asientosOcupados;

	public Sector(int numero, int cantidadAsientos) {
	
		this.numero = numero;
		this.cantidadAsientos = cantidadAsientos;
	    
	}
	
	//METODO ABSTRACTO
	public abstract double calcularPrecio(double precioBase);
	

	public int obtenerNumero() {
		return numero;
	}

	 public int obtenerCantidadAsientos() {
	        return cantidadAsientos;
	    }
	 
	 


	    public boolean tieneAsientoDisponible() {
	        return cantidadAsientos > 0;
	    }
	    
	    ////?????????????
	    public void reducirAsientos() {
	        if (cantidadAsientos > 0) {
	            cantidadAsientos--;
	        }
	    }

		public abstract String obtenerTipo();


}