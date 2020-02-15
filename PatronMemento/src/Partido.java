/**
 * Crea el memento que contiene una foto de su estado interno actual
 * Usa el memento para volver a su estado anterior
 * El partido seria la figura del ORIGINADOR
 * @author JC
 *
 */
public class Partido {

	private String equipoLocal;
	private String equipoVisitante;
	private int puntosEquipoLocal;
	private int puntosEquipoVisitante;
	private int periodoPartido;
	
	/**
	 * Creamos/guardamos el estado del objeto a traves del Memento
	 * @return
	 */
	public Memento crearMemento ()
	{
		return new Memento(puntosEquipoLocal,puntosEquipoVisitante,periodoPartido);
	}
	/**
	 * Recuperamos el estado del Partido en un momento determinado atraves del memento
	 * @param m
	 */
	public void RecuperarMemento (Memento m)
	{
		this.puntosEquipoLocal = m.getPuntosEquipoLocal();
		this.puntosEquipoVisitante = m.getPuntosEquipoVisitante();
		this.periodoPartido = m.getPeriodoPartido();
	}

	public String getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(String equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public String getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(String equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public int getPuntosEquipoLocal() {
		return puntosEquipoLocal;
	}

	public void setPuntosEquipoLocal(int puntosEquipoLocal) {
		this.puntosEquipoLocal = puntosEquipoLocal;
	}

	public int getPuntosEquipoVisitante() {
		return puntosEquipoVisitante;
	}

	public void setPuntosEquipoVisitante(int puntosEquipoVisitante) {
		this.puntosEquipoVisitante = puntosEquipoVisitante;
	}

	public int getPeriodoPartido() {
		return periodoPartido;
	}

	public void setPeriodoPartido(int periodoPartido) {
		this.periodoPartido = periodoPartido;
	}
}
