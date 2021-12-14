package progmultihilo.apartado3;

import java.util.List;

public class Cliente implements Runnable {

    private String nombre;
    private List<String> productos;
    private Probador probador;

    public Cliente(String nombre, List<String> productos, Probador probador) {
        this.nombre = nombre;
        this.productos = productos;
        this.probador = probador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getProductos() {
        return productos;
    }

    public void setProductos(List<String> productos) {
        this.productos = productos;
    }

    public Probador getProbador() {
        return probador;
    }

    public void setProbador(Probador probador) {
        this.probador = probador;
    }

    @Override
    public void run() {
        this.probador.pasoPorProbador(this);
    }
}
