package dani.minim1.tardor2017;

import java.util.HashMap;

public class Pedido {

    int idPedido;
    HashMap<Integer,Producto> productospedidos;


    public Pedido (int idPedido) {

        this.idPedido = idPedido;
        productospedidos = new HashMap<Integer, Producto>();

    }

    public Pedido () {
        productospedidos = new HashMap<Integer, Producto>();
    }


    public int getID () {return idPedido;}

    public HashMap<Integer,Producto> getProductospedidos (){

        return productospedidos;
    }

    public void setIdPedido (int idPedido){
        this.idPedido=idPedido;
    }

    public void setProductospedidos (HashMap<Integer,Producto> productospedidos){
        this.productospedidos=productospedidos;
    }



}
