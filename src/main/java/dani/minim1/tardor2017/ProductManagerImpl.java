package dani.minim1.tardor2017;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Vector;


public class ProductManagerImpl implements ProductManager {

    private static final Logger logger = LogManager.getLogger(ProductManagerImpl.class.getName());

    private static ProductManagerImpl instance = null;

    private ProductManagerImpl() {
        this.usuarios = new HashMap<String, Usuario>();
    }

    public static ProductManagerImpl getInstance() {
        if (instance == null)
            instance = new ProductManagerImpl();
        return instance;
    }

    HashMap<String, Usuario> usuarios;
    Vector<Producto> productos;

    public Boolean AddUsuario(Usuario usuario) {
        if (usuarios.containsKey(usuario.getNombre())) {
            logger.error("addUsuario: El usuario ya existe");
            return false;
        } else {
            logger.info("addUsuario: Usuario añadido");
            usuarios.put(usuario.getNombre(), usuario);
            return true;
        }



    }

    public void AddProducto (Producto producto){
        productos.add(producto);
    }

   // public Producto[] ListaProductosDescendente() {
     //   Arrays.sort(arrayProductos);
       // return arrayProductos;
   // }

    public Vector<Pedido> pedidosRealizados (Usuario usuario){
        return usuario.getPedidos();
    }

    public void servirPedido (Vector<Producto> productos,Usuario usuario){
logger.info("Servir productos a usuario:"+usuario);
        usuario.HacerPedido(productos);
    }

    public void reiniciarSingleton()
    {
        instance = null;
    }

}



