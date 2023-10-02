package miguel.angel.zamora.perez.examen;

import utils2.Utilidades;

public class Restaurante {
	
	private String nombre;

	public static void main(String[] args) {
		
		Restaurante rt = new Restaurante ("Restaurante Java");
		rt.crearRestaurante();
		
		

	}
	
	private void crearRestaurante()
	{
		Plato plato1 = new Plato("Pato confitado",15.2f,true);
		Plato plato2 = new Plato("Judias verdes",9.5f,true);
		Plato plato3 = new Plato("Crema de espinacas",8.0f,false);
		Plato plato4 = new Plato("Lubina salvaje",11.1f,true);
		Plato plato5 = new Plato("Cochinillo",22.7f,true);
		
		Plato grupoPlatos1[] = {plato1,plato2,plato3};
		Plato grupoPlatos2[] = {plato4,plato5};
		
		Bebida bebida1=new Bebida("Refresco",5.0f);
		Bebida bebida2=new Bebida("Vino blanco",7.0f);
		
		Carta carta1= new Carta("principal",grupoPlatos1,bebida1);
		Carta carta2= new Carta("festivos",grupoPlatos2,bebida2);
		
		int seleccion;
		
		
		carta1.mostrarCarta();
		carta2.mostrarCarta();
		seleccion=seleccionarMenu();
		
		
			
	}
	
	private int seleccionarMenu()
	{
		return Utilidades.pideNumero("Seleccione una de las cartas",1,2);
	}

	public Restaurante(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
	

}
