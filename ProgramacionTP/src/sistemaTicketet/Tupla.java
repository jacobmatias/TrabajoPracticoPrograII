package sistemaTicketet;

public class Tupla<C,V> {
	
	private C clave;
	private V valor;
	
	
	
	//constructor
	public Tupla(C clave,V valor) {
		this.clave=clave;
		this.valor=valor;
	}
	
	
	public C getClave() {
		return clave;
	}
	
	
	public V getValor() {
		return valor;
	}


	public void  setearClave(C clave) {
		
		this.clave=clave;
		
	}
	
	public void setearValor(V valor) {
		this.valor=valor;
	}
	
	
	@Override
	public String toString() {
		return "<" + clave + ":" + valor +">";
	}
	
}

