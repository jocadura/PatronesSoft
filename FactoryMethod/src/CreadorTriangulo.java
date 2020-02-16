/*
 * Clase que redefine el metodo de creacion del poligono.
 * Crea el objeto dentro de la subclase con el metodo de fabricacion definido
 * */
public class CreadorTriangulo  extends CreadorDePoligono{

	@Override
	public Poligono crearPoligono() {
		System.out.println("Esta usando el metodo crearPoligono de la clase especializada en crear triangulos.");
		System.out.println ("Va a crear un objeto de tipo triangulo usando un producto tipo TRIANGULO ");
		return new Triangulo ();
	}
}
