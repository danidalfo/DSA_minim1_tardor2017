package dani.minim1.tardor2017;

import java.util.HashMap;
import java.util.Vector;

public class Pedido {

    Vector<Comanda> productos;
    Usuario usuario;


    public Pedido () {
        productos = new Vector<Comanda>();
    }



    public Vector<Comanda> getProductospedidos (){

        return productos;
    }

    public void setProductospedidos(Vector<Comanda> productos) {
        this.productos = productos;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }





}
