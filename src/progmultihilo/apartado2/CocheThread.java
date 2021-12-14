package progmultihilo.apartado2;
/**
 * 
 */

/**
 * @author JESUS
 *
 */
public class CocheThread extends Thread{
	
	/**
	 * Estos son los atributos de la clase CocheThread.
	 * NO ES NECESARIO AÑADIR NINGUNO MÁS.
	 */
	private Semaforo semaforo;
	private int segundos;

	public CocheThread(String nombre, int segundos, Semaforo sem){
		super(nombre);
		this.segundos = segundos;
		this.semaforo = sem;
	}

	public Semaforo getSemaforo() {
		return semaforo;
	}

	public void setSemaforo(Semaforo semaforo) {
		this.semaforo = semaforo;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	@Override
	public void run() {
		this.semaforo.cerrarCarril(this);
		this.semaforo.abrirCarril(this);
	}
}
