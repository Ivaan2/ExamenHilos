package progmultihilo.apartado2;
/**
 * 
 */

/**
 * @author JESUS
 *
 */
public class Semaforo {
	
	/**
	 * Pinta por pantalla cuál es el vehículo que entra en el carril.
	 * @param c
	 */
	public synchronized void cerrarCarril(CocheThread c) {
		System.out.println(c.getName() + " entra en el carril.");
		try {
			Thread.sleep(c.getSegundos() * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Pinta por pantalla el vehículo que sale y el tiempo que ha dormido
	 * @param c
	 */
	public synchronized void abrirCarril(CocheThread c) {
		System.out.println(c.getName() + " sale del carril tras " + c.getSegundos() + " segundos.");

	}
}