/**
 * Clase de la capa de implementación.
 * @author JC
 *
 */
public class BancoBankia implements Banco {
	
	public BancoBankia() {
		System.out.println ("Bienvenido a Bankia");
	}

	@Override
	public void extraerDineroCajero(boolean cajeroPropio) {

       if (!cajeroPropio) 
       {
		System.out.println ("Bankia te cobrara una comision  de 3 euros por la operacion");
	   }
       else 
       {
    	   System.out.println ("Operacion libre de comision");
	   }
		
	   System.out.println ("Operacion realizada por la capa de implementación");
	}
	
	@Override
	public void depositarDinero(int cantidad) {

		 if (cantidad >= 1500) 
	       {
			System.out.println ("Para ingresos superiores a 1500 euros acuda a su sucursal de BANKIA mas cercana.Gracias !!!");
		   }
	       else 
	       {
	    	   System.out.println ("Operación realizada, gracias por usar este servicio.");
		   }
			
		   System.out.println ("Operacion realizada por la capa de implementación");
	}

	@Override
	public void solicitarPlandePensiones() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void solicitarHipoteca() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void solicitarTarjetaCredito() {
		// TODO Auto-generated method stub
		
	}

	

}
