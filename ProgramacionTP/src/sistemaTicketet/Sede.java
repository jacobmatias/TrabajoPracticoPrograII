package sistemaTicketet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Sede {
    private String nombre;
    private String direccion;
    private int capacidad;
    private Set<Sector> sectores; //Conjunto

    // Constructor
    public Sede(String nombre, String direccion, int capacidad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.capacidad = capacidad;
        this.sectores = new HashSet<>();
    }
    
    //getters
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public int obtenerCapacidad() {
        return capacidad;
    }

    public abstract String obtenerTipo(); // Método abstracto,obliga a implementar

    public List<Sector> obtenerSectores() {
        return new ArrayList<>(sectores);
    }

    public boolean tieneSector(String tipo, int numero) {
        for (Sector sector : sectores) { //for each
            if (sector.obtenerTipo().equals(tipo) && sector.obtenerNumero() == numero) {
                return true;
            }
        }
        return false;
    }

    public Sector obtenerSector(String tipo, int numero) {
        for (Sector sector : sectores) {
            if (sector.obtenerTipo().equals(tipo) && sector.obtenerNumero() == numero) {
                return sector;
            }
        }
        return null;
    }

    public void reducirCapacidad() {
        if (capacidad > 0) {
            capacidad--; //SERA ESTO ASI?	 
        }
    }

    public double calcularPrecioEntrada(Sector sector, double precioBase) {
        return sector.calcularPrecio(precioBase);
    }

    protected void agregarSector(Sector sector) {
        sectores.add(sector);
    }
}
    

