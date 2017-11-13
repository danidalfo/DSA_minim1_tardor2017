package dani.minim1.tardor2017;

import java.util.Vector;

public class Usuario {

    private int id;
    private String nombre;
    private String email;
    private Vector<Producto> productos;
    private Vector<Pedido> pedidos;


        // Constructors

        public Usuario (int id,String nombre,String email) {
            this.id = id;
            this.nombre = nombre;
            productos = new Vector<Producto>();
            this.email = email;
        }

        public Usuario()
        {
            productos = new Vector<Producto>();
        }

        // Getters i setters

        public int getID () {return id;}

        public String getNombre() {
            return nombre;
        }

        public String getEmail() {
            return email;
        }

        public void setID (int id) {this.id = id;}

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setProductos(Vector<Producto> productos) {
        this.productos = productos;
    }

        public boolean addProducto(Producto o) {
            if(o!=null)
            {
                productos.add(o);
                return true;
            }
            return false;
        }

        public boolean addPedido(Pedido o) {
        if(o!=null)
        {
            pedidos.add(o);
            return true;
        }
        return false;
    }

        public Vector<Producto> getProductos() {
            return productos;
        }

        public Vector<Pedido> getPedidos() {
        return pedidos;
    }

        public void HacerPedido (Vector<Producto> productos){

            Pedido pedido = new Pedido();
            pedido.setProductospedidos(productos);
            this.pedidos.add(pedido);
            int i;
            for (i=0;i<productos.size();i++){
                this.addProducto(productos.elementAt(i));
            }

        }

    @Override
        public String toString() {
            return "Nombre del Usuario: "+nombre+" Email: "+email;
        }
    }

