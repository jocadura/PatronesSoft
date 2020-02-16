/**
 * Cliente : Instanciando un tipo de cajero podremos realizar (mediante
 *            el patron bridge) operaciones en el  cajero y en la entidad bancaria a la que pertenece
 * @author JC
 *
 */
public class Principal {

	public static void main(String[] args) 
	{	
		// Definimos un cajero de Banco concreto
        CajeroAutomatico cajero = new CajeroFull(new BancoSantander());
        System.out.println("****************************************");
        // Solicitamos sacar dinero, indicamos que es un cajero ajeno a la red del banco
        cajero.extraerDinero(true);
        // Operación de actualización de libreta
        System.out.println("****************************************");
        cajero.actualizarLibreta();
        System.out.println("****************************************");
        // Solicitamos realizar un deposito , segun la cantidad indicada nos indicara si se puede 
        cajero.realizarDeposito(1500);
        System.out.println("****************************************");
        // Solictamos recargar la tarjeta de teléfono
        cajero.realizarRecargaTélefonica();
	}

}
