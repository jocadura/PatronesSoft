/**
 * Clase abstracta que define las operaciones que se pueden hacer con un tranporte
 * @author JC
 *
 */
public abstract class Transporte {
	public abstract Transporte setOrigen(String origen);
	public abstract Transporte setDestino(String destino);
	public abstract Transporte setTipo(String tipo);
	public abstract String getOrigen();
	public abstract String getDestino();
	public abstract String getTipo();
}
