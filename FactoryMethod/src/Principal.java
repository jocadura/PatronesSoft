/*
 * Cliente que consume el patron Factory Method
 * Se trabaja siempre con un creador de poligonos, bien individualmente o 
 * mediante una factoria simple, parametrizada.
 * */
public class Principal {

	/**
	 * Con este cliente podemos crear el poligono directamente mediante una clase creadora concreta o bien
	 * mediante una factoria simple parametrizada que en función del poligono a crear instanciara un objeto u otro.
	 * @param args
	 */
	public static void main(String[] args) {
		
	/*	// Creamos el objeto Cuadrado mediante un creador Cuadrado
		CreadorDePoligono creadorPoligono = new CreadorCuadrado();
		creadorPoligono.diseñarPoligono();
		System.out.println ("**************************************************************");
		// Creamos el objeto Triangulo mediante un creador Triangulo
		creadorPoligono = new CreadorTriangulo();
		creadorPoligono.diseñarPoligono();
		/**
		 * En este caso la creacion del producto se parametriza y es una factoria de poligonos la que crea en funcion del tipo de poligono a crear.
		 */

		FactoriaPoligonos factoria = new FactoriaPoligonos();
		factoria.crearPoligono("Triangulo").mostrarPoligono(); 
		Poligono prueba = factoria.crearPoligono("Cuadrado");
		prueba.mostrarPoligono();

	}

}