package dani.minim1.tardor2017;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;


public class ProductManagerImpl implements ProductManager {

    HashMap<String, Usuario> usuarios;
    HashMap<String,Producto> cartaProductos;
    Queue<Pedido> ColaPedidos;

    private static final Logger logger = LogManager.getLogger(ProductManagerImpl.class.getName());

    static ProductManagerImpl instance = null;

    private ProductManagerImpl() {

        usuarios = new HashMap<String, Usuario>();
        usuarios.put("Dani",new Usuario(1,"Dani","dani.dalfo.f@gmail.com"));
        usuarios.put("Joan",new Usuario(2,"Joan","joanete@gmail.com"));
        usuarios.put("Borja",new Usuario(3,"Borja","str1992@gmail.com"));
        cartaProductos = new HashMap<String, Producto>();
        cartaProductos.put("entrepanxova",new Producto("Nxovaca",2,2));
        cartaProductos.put("Truitad'amistat",new Producto("amics",300,4));
        ColaPedidos = new LinkedList<Pedido>();
    }

    public static ProductManagerImpl getInstance() {
       logger.info("Nou ProductManagerImpl");
        if (instance == null) {
            instance = new ProductManagerImpl();
            logger.info("Nou ProductManagerImpl");
        }
        return instance;
    }

    public void servirPedido() {
        logger.info("Servint pedido");

        Pedido pedido = ColaPedidos.poll();
        if(pedido==null)
            logger.info("Tots els pedidos estan servits");


        for (Comanda q: pedido.getProductospedidos()) {
            Producto producto = cartaProductos.get(q.getNombreProducto());
            producto.setVentas(producto.getVentas()+q.getCantidad());
            logger.info("nom: "+producto.getNombre()+" cantitat "+producto.getVentas());
        }

        Usuario usuario = usuarios.get(pedido.getUsuario().getNombre());
        usuario.addPedido(pedido);

    }

    public void hacerPedido(Pedido pedido) {

        logger.info("Se hace un pedido");

        Usuario usuario = usuarios.get(pedido.getUsuario().getNombre());


        for (Comanda p: pedido.getProductospedidos()) {
            if(cartaProductos.get(p.getNombreProducto())==null) {
                logger.error("No existe el producto");
            }
        }

        usuario.addPedido(pedido);

        ColaPedidos.add(pedido);

    }

    public Vector<Pedido> pedidosRealizados (Usuario usuario){
        return usuario.getPedidos();
    }

    public void reiniciarSingleton()
    {
        instance = null;
    }

}



