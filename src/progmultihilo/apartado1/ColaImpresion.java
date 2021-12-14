/**
 * 
 */
package progmultihilo.apartado1;

/**
 * @author JESUS
 *
 */
public class ColaImpresion{
	String mensaje;
	int palabras;
	boolean disponible = true;
	public ColaImpresion(int length) {
		palabras = length;
	}

	void enviar(String s) {
		while(!disponible){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		mensaje = s;
		disponible = false;
		notifyAll();
	}

	public String recibir() {
		while(disponible){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		disponible = true;
		notifyAll();
		return mensaje;
	}
}
