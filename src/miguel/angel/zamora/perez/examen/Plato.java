package miguel.angel.zamora.perez.examen;

public class Plato {
	private String nombre;
	private float precio;
	private boolean disponible;

	public Plato(String nombre, float precio, boolean disponible) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.disponible = disponible;
	}
	
	@Override
	public String toString() {
		return (this.nombre + "\t\t\t" + precio + " €");
	}

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
