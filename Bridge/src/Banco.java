/**
 * Interfaz con las operaciones mas comunes de un Banco
 * @author JC
 *
 */
public interface Banco {
    
	public void extraerDineroCajero (boolean cajeroDelBanco);
	public void depositarDinero (int cantidad);
	public void solicitarPlandePensiones();
	public void solicitarHipoteca();
	public void solicitarTarjetaCredito();
	
}
