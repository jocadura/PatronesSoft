/**
 * Interfaz que permite la creacion de hoteles y transportes seria el fabricante.
 * Declara una interfaz para operaciones que devuelven objetos de productos abstractos.
 * @author JC
 *
 */
public interface FactoriaComponentes {
	public Hotel crearHotel();
	public Transporte crearTransporte();
}
