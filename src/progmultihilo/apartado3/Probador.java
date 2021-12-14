package progmultihilo.apartado3;

public class Probador {
    boolean libre = true;

    //Mediante wait y notifyall doy prioridad a los clientes apra que entren en los
    //probadores si estan libres y respetent turnos
    public synchronized void pasoPorProbador(Cliente c){
        while(!libre){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        libre = false;
        System.out.println(c.getNombre() + " accede al probador.");
        //Este metodo recorre el cojunto de productos
        for (String p: c.getProductos()) {
            System.out.println(p);
        }
        System.out.println();
        libre = true;
        notifyAll();
    }
}
