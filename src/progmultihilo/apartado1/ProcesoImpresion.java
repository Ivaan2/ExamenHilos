/**
 * 
 */
package progmultihilo.apartado1;

/**
 * @author JESUS
 *
 */
public class ProcesoImpresion implements Runnable {
	ColaImpresion cola;
	String[] mensajeCompleto;
	
	/**
	 * 
	 */
	public ProcesoImpresion(String[] mensaje, ColaImpresion cola) {
		this.cola = cola;
		this.mensajeCompleto = mensaje;
	}

	@Override
	public synchronized void run() {
		for (int i = 0; i < cola.palabras; i++){
			cola.enviar(mensajeCompleto[i]);
		}
	}
}
