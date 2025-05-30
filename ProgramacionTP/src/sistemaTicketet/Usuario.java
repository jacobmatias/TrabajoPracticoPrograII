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
	
}
