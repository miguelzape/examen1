package miguel.angel.zamora.perez.examen;

public class Bebida {
	private String nombre;
	private float precio;

	// Constructor de la clase
	public Bebida(String nombre, float precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	// Funciones get para cada mienbro de la clase
	public String getNombre() {
		return nombre;
	}

	public float getPrecio() {
		return precio;
	}
	
}
