package miguel.angel.zamora.perez.examen;

public class Carta {

	private String nombre;
	private Plato platos[];
	private Bebida bebidas[];


	// Constructor de la clase
	// necesita el nombre, un array con los platos, y al final las bebidas 
	// (de una en una o dentro de un array) 
	
	public Carta(String nombre, Plato[] platos, Bebida... bebidas) {
		super();
		this.nombre = nombre;
		this.platos = platos;
		this.bebidas = bebidas;
	}

	// "mostraCarta" muestra por pantalla los platos que incluye esta carta
	// tambien podria mostar las bebidas si fuera necesario 
	// quitando los comentarios de las ultimas lineas
	public void mostrarCarta(int numero) {
		System.out.printf("\nPlatos de Carta %d: \"%s\"\n",numero,this.nombre);
		for (Plato p : this.platos) {
			if (p.isDisponible())
				System.out.println("\t"+p.getNombre());
		}
	/*	System.out.println("Bebidas:");
		for (Bebida b : this.bebidas) {
			System.out.println("\t"+b.getNombre());
		}*/
	}

	// "importeCarta" devuelve el importe total de la carta
	// no incluye el coste de los platos "no disponibles"
	public float importeCarta() {
		float total = 0;
		for (Plato p : this.platos) {
			if (p.isDisponible())
				total += p.getPrecio();
		}

		for (Bebida b : this.bebidas) {
			total += b.getPrecio();
		}

		return total;

	}

	// Funciones get para cada mienbro de la clase
	public String getNombre() {
		return nombre;
	}

	public Plato[] getPlatos() {
		return platos;
	}

	public Bebida[] getBebidas() {
		return bebidas;
	}

}
