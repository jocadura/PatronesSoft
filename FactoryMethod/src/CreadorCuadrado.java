/*
 * Clase que redefine el metodo de creacion del poligono.
 * */
public class CreadorCuadrado extends CreadorDePoligono{

	@Override
	public Poligono crearPoligono() {
		System.out.println("Esta usando el metodo crearPoligono de la clase especialista en crear cuadrados.");
		System.out.println ("Va a crear un objeto de tipo cuadrado usando un producto CUADRADO ");
		return new Cuadrado();
	}

}
