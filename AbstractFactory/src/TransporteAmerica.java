/**
 * Clase de tranporte del continente americano.
 * Se establecen y obtienen las propiedades necesarias
 * @author JC
 *
 */
public class TransporteAmerica extends Transporte{
    
	private String origen;
    private String destino;
    //
    private String tipo;
    
	public TransporteAmerica() {}
	@Override
	public Transporte setOrigen(String origen) {
		this.origen = origen;
		return this;
	}

	@Override
	public Transporte setDestino(String destino) {
		this.destino = destino;
		return this;
	}

	@Override
	public Transporte setTipo(String tipo) {
		this.tipo = tipo;
		return this;
	}

	@Override
	public String getOrigen() {
		return this.origen;
	}

	@Override
	public String getDestino() {
	   return this.destino;
	}

	@Override
	public String getTipo() {
		return this.tipo;
	}

}
