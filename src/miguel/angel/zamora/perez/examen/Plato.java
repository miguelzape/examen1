package miguel.angel.zamora.perez.examen;

public class Plato {
	private String nombre;
	private float precio;
	private boolean disponible;

	// Constructor de la clase
	public Plato(String nombre, float precio, boolean disponible) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.disponible = disponible;
	}
	

	// Funciones get para cada mienbro de la clase
	public String getNombre() {
		return nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public boolean isDisponible() {
		return disponible;
	}
	
	

}
