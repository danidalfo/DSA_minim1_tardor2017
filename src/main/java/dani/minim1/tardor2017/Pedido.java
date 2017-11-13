package dani.minim1.tardor2017;

import java.util.HashMap;
import java.util.Vector;

public class Pedido {

    int idPedido;
    Vector<Producto> productos;


    public Pedido (int idPedido) {

        this.idPedido = idPedido;
        productos = new Vector<Producto>();

    }

    public Pedido () {
        productos = new Vector<Producto>();
    }


    public int getID () {return idPedido;}

    public Vector<Producto> getProductospedidos (){

        return productos;
    }

    public void setIdPedido (int idPedido){
        this.idPedido=idPedido;
    }

    public void setProductospedidos (Vector<Producto> productos){
        this.productos=productos;
    }



}
