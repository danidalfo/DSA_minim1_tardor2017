package dani.minim1.tardor2017;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Vector;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNull;


public class AppTest
{
    @Before
    public void setUp()
    {
        ProductManagerImpl.getInstance();
    }

    @After
    public void tearDown()
    {
        ProductManagerImpl.getInstance().reiniciarSingleton();
    }

    @org.junit.Test
    public void hacerunpedido()
    {

        ProductManagerImpl productManager = ProductManagerImpl.getInstance();

        Pedido pedido = new Pedido();
        pedido.setUsuario(new Usuario(1,"Dani","dani.dalfo.f@gmail.com"));
        Vector<Comanda> productos = new Vector<Comanda>();
        productos.add(new Comanda("gos",3));
        productos.add(new Comanda("cabra",30));
        pedido.setProductospedidos(productos);

        Assert.assertEquals(productManager.hacerPedido(pedido),true);


    }

    @Test
    public void servirUnpedido()
    {
        ProductManagerImpl productManager = ProductManagerImpl.getInstance();

        Pedido pedido = new Pedido();
        pedido.setUsuario(new Usuario(1,"Dani","dani.dalfo.f@gmail.com"));
        Vector<Comanda> productos = new Vector<Comanda>();
        productos.add(new Comanda("butano",50));
        productos.add(new Comanda("mechero",3));
        pedido.setProductospedidos(productos);
        productManager.hacerPedido(pedido);
        Assert.assertEquals(pedido,productManager.servirPedido());
        assertNull(productManager.servirPedido());
    }



}