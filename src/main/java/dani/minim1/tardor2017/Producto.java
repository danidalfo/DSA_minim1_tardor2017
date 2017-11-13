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

    public int getId() {
        return id;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

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
