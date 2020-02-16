/**
 * Clase de hotel del continente americano.
 * Se establecen y obtienen las propiedades necesarias
 * Define un objeto producto (Hotel) para que sea creado
 * @author JC
 * 
 *
 */
public class HotelAmerica extends Hotel {

    private String ubicacion;
    private String categoria;
    private String tipo;
    private int numero;
	
	public HotelAmerica()
	{
		super();
	}

	@Override
	public Hotel setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
		return this;
	}

	@Override
	public Hotel setCategoria(String categoria) {
		this.categoria = categoria;
		return this;
	}

	@Override
	public Hotel setTipo(String tipo) {
		this.tipo = tipo;
		return this;
	}
	
	@Override
	public String getUbicacion ()
	{
		return this.ubicacion;
	}
	@Override
	public String getCategoria ()
	{
		return this.categoria;
	}
	@Override
	public String getTipo()
	{
		return this.tipo;
	}
	
}

