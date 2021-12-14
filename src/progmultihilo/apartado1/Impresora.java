/**
 * 
 */
package progmultihilo.apartado1;

import java.util.ArrayList;

/**
 * @author JESUS
 *
 */
public class Impresora implements Runnable{

	ColaImpresion cola; 
	
	public Impresora (ColaImpresion cola) {
		this.cola = cola;
	}

	@Override
	public synchronized void run() {
		//Al recibir la palabra por medio de la cola, se imprime por pantalla
		//Lo tenía hecho para que imprimiese desde proceso pero lo he intentado modificar
		//Para que se sincornice con la impresora
		ArrayList<String> listaPalabras = new ArrayList<String>();
		int contador = 0;
		listaPalabras.add(cola.recibir());
		while(contador != cola.palabras){

			System.out.print(listaPalabras.get(contador) + " ... ");
			try {
				wait(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			contador++;
		}
	}
}
