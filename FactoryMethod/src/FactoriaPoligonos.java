/*
 * Clase factoria para la fabricacion de poligonos de forma parametrizada,
 * en funcion del tipo de poligono instanciara el producto concreto.
 */
public class FactoriaPoligonos {

	public Poligono crearPoligono (String nombre)
	{
		Poligono poligono = null;
		
		switch (nombre)
		 {
			case "Triangulo":
				System.out.println("Creando Triangulo");
				poligono = new Triangulo();
				break;
			case "Cuadrado":
				System.out.println("Creando Cuadrado");
				poligono = new Cuadrado();
				break;
		 }
		return poligono;		
	}
}
