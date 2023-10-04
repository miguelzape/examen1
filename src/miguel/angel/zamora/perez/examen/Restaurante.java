package miguel.angel.zamora.perez.examen;

import utils2.Utilidades;

public class Restaurante {

	private final boolean DISPONIBLE = true;
	private final boolean NO_DISPONIBLE = false;
	private String nombre;

	public static void main(String[] args) {

		Restaurante rt = new Restaurante("Java");
		rt.abrirRestaurante();

	}
	
	// Constructor de la clase.
	public Restaurante(String nombre) {
		super();
		this.nombre = nombre;
	}

	// "abrirRestaurante" crea una carta con 3 platos (uno no disponible) y una bebida,
	// y otra carta con 2 platos y una bebida
	// y pide que se haga la seleccion de una de ellas (mostrando previamente los platos
	// que la componen sin las bebidas)
	// despues muestra en pantalla cual es el precio total de la carta seleccionada
	private void abrirRestaurante() {
		Plato plato1 = new Plato("Pato confitado", 15.2f, DISPONIBLE);
		Plato plato2 = new Plato("Judias verdes", 9.5f, DISPONIBLE);
		Plato plato3 = new Plato("Crema de espinacas", 8.0f, NO_DISPONIBLE);
		Plato plato4 = new Plato("Lubina salvaje", 11.1f, DISPONIBLE);
		Plato plato5 = new Plato("Cochinillo asado", 22.7f, DISPONIBLE);

		Plato grupoPlatos1[] = { plato2, plato1, plato3 };
		Plato grupoPlatos2[] = { plato4, plato5 };

		Bebida bebida1 = new Bebida("Refresco", 5.0f);
		Bebida bebida2 = new Bebida("Vino blanco", 7.0f);
		
		Carta carta1 = new Carta("principal", grupoPlatos1, bebida1);
		Carta carta2 = new Carta("festivos", grupoPlatos2, bebida2);
		Carta cartasDisponibles[] = { carta1, carta2 };

		int seleccion;
		
		
		System.out.println("Abre sus puertas el restaurante " + this.nombre);
		seleccion = seleccionarCarta(cartasDisponibles);

		System.out.printf("El importe total de la carta %s es de %.2f€ ",
				cartasDisponibles[seleccion].getNombre(),
				cartasDisponibles[seleccion].importeCarta());

	}

	// "seleccionarCarta" es una funcion que recibe como parametro un array de cartas disponibles
	// y pide por pantalla que se seleccione una de ellas (con el numero asociado a la carta)
	// Devuelve el indice del array que contiene esa carta
	private int seleccionarCarta(Carta[] cartasDisponibles) {
		System.out.println("Estas son las cartas disponibles");
		for (int i = 0; i < cartasDisponibles.length; i++) {
			cartasDisponibles[i].mostrarCarta(i + 1,true);
		}
		return Utilidades.pideNumero("\nSeleccione una de las cartas", 1, cartasDisponibles.length) - 1;

	}	

}
