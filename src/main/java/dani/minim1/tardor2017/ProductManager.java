package dani.minim1.tardor2017;

import java.util.HashMap;
import java.util.Vector;

public interface ProductManager {

    public void servirPedido();

    public void hacerPedido(Pedido pedido);

    public Vector<Pedido> pedidosRealizados (Usuario usuario);

    void reiniciarSingleton();
}
