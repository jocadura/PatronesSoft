/**
 * Guarda el estado interno del ORIGINADOR (Partido)
 * El ORIGINADOR determina los datos a guardar en el MEMENTO solo el 
 * ORIGINADOR debe ser capaz de leer el MEMENTO.
 * Usa el MEMENTO para volver a su estado anterior.
 * @author JC
 *
 */
public class Memento {

	// atributos del partido que vamos a guardar
	private int puntosEquipoLocal;
	private int puntosEquipoVisitante;
	private int periodoPartido;


	/**
	 * Constructor del memento
	 * @param puntosEquipoLocal
	 * @param puntosEquipoVisitante
	 * @param periodoPartido
	 */
	public Memento(int puntosEquipoLocal, int puntosEquipoVisitante,int periodoPartido) {
       this.puntosEquipoLocal = puntosEquipoLocal;
       this.puntosEquipoVisitante = puntosEquipoVisitante;
       this.periodoPartido = periodoPartido;
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
