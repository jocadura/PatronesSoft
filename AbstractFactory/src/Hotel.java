/**
 * Producto abstracto : Clase abstracta que define las operaciones que se pueden hacer con un hotel
 * @author JC
 *
 */
public abstract class Hotel {
	public abstract Hotel setUbicacion(String ubicacion);
	public abstract Hotel setCategoria(String categoria);
	public abstract Hotel setTipo(String tipo);
	public abstract String getUbicacion();
	public abstract String getCategoria();
	public abstract String getTipo();
}
