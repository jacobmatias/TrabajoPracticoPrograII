package sistemaTicketet;

import java.time.LocalDate;

public class Entrada {

	private String codigoEntrada;
	private String codigoEspectaculo;
	private Sector sector;
	private Funcion funcion;
	
	public Entrada() { //constructor
		
	}
	
	
	public double obtenerPrecio() {
		return 0;
	}
	
	public String obtenerUbicacion() {
		return "";
	}
	
	public String obtenerCodigoEntrada() {
		return codigoEntrada;
	}
	
	
	public String obtenerCodigoEspectaculo() {
		return codigoEspectaculo;
	}
	
	public LocalDate obtenerFechaFuncion() {
		return funcion.obtenerFecha();
	}
}
