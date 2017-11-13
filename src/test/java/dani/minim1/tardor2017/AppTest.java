package dani.minim1.tardor2017;


import org.junit.After;
import org.junit.Before;

import static junit.framework.TestCase.assertEquals;


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
    public void realizarunpedido()
    {

        ProductManagerImpl.getInstance().AddUsuario(new Usuario(1,"Juan","juan@yahoo.es"));
        ProductManagerImpl.getInstance().AddProducto(new Producto());
        ProductManagerImpl.getInstance().servirPedido();


    }



}