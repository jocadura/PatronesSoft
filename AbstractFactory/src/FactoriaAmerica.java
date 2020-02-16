/**
 * Factoria concreta que se encarga de crear los diferentes productos
 * 
 * @author JC
 *
 */
public class FactoriaAmerica implements FactoriaComponentes{

	public FactoriaAmerica() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public Hotel crearHotel() {
		return new HotelAmerica();
	}
	@Override
	public Transporte crearTransporte() {
		// TODO Auto-generated method stub
		return new TransporteAmerica();
	}
}
