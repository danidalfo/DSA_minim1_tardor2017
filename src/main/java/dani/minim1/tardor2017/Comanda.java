package dani.minim1.tardor2017;

public class Comanda {
    String nombreProducto;
    int cantidad;

    public Comanda() {
    }

    public Comanda(String producto, int cantidad) {
        this.nombreProducto = producto;
        this.cantidad = cantidad;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }


}

