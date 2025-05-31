package sistemaTicketet;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Espectaculo {
	private String codigo;
	private String nombre;
	HashMap<String,Funcion> funciones; //clave combinada por sede+fecha (o ID interno), representa las funciones asociadas al espectáculo.
	
	public Espectaculo(String codigo,String nombre) {
		this.codigo=codigo;
		this.nombre=nombre;
	}
	
	void agregarFuncion(String codigoSede,LocalDate fecha,double precioBase) {
		
	}
	
	boolean existeFuncion(String codigoSede,LocalDate fecha) {
		return true;
	}
	
	/*ArrayList <Funcion> listarFunciones(){
		return funciones;
	}
	*/
	
	boolean existeEspectaculoParaSede(String codigoSede, LocalDate fecha) {
		return true;
	}
	
	double consultarValorEntrada(String codigoSede, LocalDate fecha, String tipoSector, int numeroSector) {
		return 0;
	}
}
