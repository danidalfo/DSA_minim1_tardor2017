package dani.minim1.tardor2017;

public class Producto implements Comparable<Producto> {

    private int id;
    private String nombre;
    private int precio;

    // Constructores

    public Producto (int id,String nombre,int precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto() {}

    @Override
    public int compareTo(Producto o) {
        if (precio < o.precio) {
            return -1;
        }
        if (precio > o.precio) {
            return 1;
        }
        return 0;
    }
}
