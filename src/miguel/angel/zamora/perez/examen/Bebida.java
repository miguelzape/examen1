package miguel.angel.zamora.perez.examen;

public class Bebida {
	private String nombre;
	private float precio;

	public Bebida(String nombre, float precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
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
	


}
