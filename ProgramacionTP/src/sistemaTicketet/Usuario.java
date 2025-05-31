package sistemaTicketet;

import java.time.LocalDate;
import java.util.HashMap;

public class Usuario {

	private String nombre;
	private String apellido;
	private String email;
	private String contrasenia;
	private HashMap<String,Entrada> entradasCompradas;
	private LocalDate fecha;
	
	
	//constructor
	public Usuario(String nombre,String appelido,String email,String contrasenia) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.email=email;
		this.contrasenia=contrasenia;
	}
	
	public void agregarEntrada() {
		
	}
	
	boolean eliminarEntrada(String codigoEntrada) {
		return false;
	}
	
	boolean existeEntrada(String codigoEntrada) {
		return true;
	}
	
	
	/*Entrada buscarEntradaPorCodigo(String codigoEntrada) {
		
	}
	*/
	
	boolean validarContraseña(String contraseñaIngresada) {
		return false;
	}
	/*
	ArrayList<Entrada> listarEntradas()
	➤ Retorna todas las entradas compradas, ordenadas por fecha.

	ArrayList<Entrada> listarEntradasFuturas()
	➤ Retorna solo las entradas con fecha posterior o igual a la actual.

	ArrayList<Entrada> listarEntradasPasadas()
}
*/
	
}