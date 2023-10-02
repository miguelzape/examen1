package miguel.angel.zamora.perez.examen;

public class Carta {
	private String nombre;
	private Plato platos[];
	private Bebida bebidas[];

//	public Carta(String nombre, Plato[] platos, Bebida[] bebidas) {
//		super();
//		this.nombre = nombre;
//		this.platos = platos;
//		this.bebidas = bebidas;
//	}

	public Carta(String nombre, Plato[] platos, Bebida... bebidas) {
		super();
		this.nombre = nombre;
		this.platos = platos;
		this.bebidas = bebidas;
	}

	public void mostrarCarta() {
		System.out.printf("\nLa carta %s\n", this.nombre);
		System.out.println("Platos:");
		for (Plato p : this.platos) {
			if (p.isDisponible())
				System.out.println(p);
		}
		System.out.println("Bebidas:");
		for (Bebida b : this.bebidas) {
			System.out.println(b);
		}
	}

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
