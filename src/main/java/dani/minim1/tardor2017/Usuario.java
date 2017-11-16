package dani.minim1.tardor2017;

import java.util.Vector;

public class Usuario {

    private int id;
    private String nombre;
    private String email;
    private Vector<Pedido> pedidos;


        // Constructors


        public Usuario (int id,String nombre,String email) {
            this.id = id;
            this.nombre = nombre;
            pedidos = new Vector<Pedido>();
            this.email = email;
        }

        public Usuario()
        {
            pedidos = new Vector<Pedido>();
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

        public void addPedido(Pedido o) {

            pedidos.add(o);


    }


        public Vector<Pedido> getPedidos() {
        return pedidos;
    }


    @Override
        public String toString() {
            return "Nombre del Usuario: "+nombre+" Email: "+email;
        }
    }

