/* 
 * Clase "Creadora" abstracta que declara el metodo de fabricacion, cada clase especializada
 * tiene que implementar el metodo de fabricacion
 * */
public abstract class CreadorDePoligono {

	// Metodo de creacion,cada clase especializada debe implementarlo
	public abstract Poligono crearPoligono();
	
	public void diseñarPoligono ()
	{
		Poligono poligono = crearPoligono();
		poligono.mostrarPoligono();
	}
}
