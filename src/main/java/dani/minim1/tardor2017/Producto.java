package dani.minim1.tardor2017;

public class Producto {

    private String nombre;
    private int precio;
    private int ventas;


    // Constructores

    public Producto (String nombre,int precio,int ventas) {

        this.nombre = nombre;
        this.precio = precio;
        this.ventas = ventas;
    }

    public Producto() {}

    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVentas() { return ventas;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setVentas(int ventas){this.ventas=ventas;}


}
