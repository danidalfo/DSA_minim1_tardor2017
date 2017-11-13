package dani.minim1.tardor2017;

import java.util.HashMap;
import java.util.Vector;

public interface ProductManager {


    public Boolean AddUsuario(Usuario usuario);

    public void AddProducto (Producto producto);

    //public Producto[] ListaProductosDescendente();

    public Vector<Pedido> pedidosRealizados (Usuario usuario);

    public void servirPedido (Vector<Producto> productos,Usuario usuario);

    public void reiniciarSingleton();
}
