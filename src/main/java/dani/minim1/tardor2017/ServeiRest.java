package dani.minim1.tardor2017;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collection;

@Path("/")
public class ServeiRest {

    ProductManagerImpl db;

    public ServeiRest() {
        this.db = ProductManagerImpl.getInstance();
    }


    @GET
    @Path("/PedidosUsuario/{usuario}")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Pedido> getPedidosUsuario(@PathParam("usuario") Usuario usuario)
    {
        return db.pedidosRealizados(usuario);
    }


    @GET
    @Path("/servirPedido/")
    @Produces(MediaType.APPLICATION_JSON)
    public Pedido servirPedido() {
        return db.servirPedido();
    }


    @POST
    @Path("/hacerPedido/")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response hacerPedido(Pedido pedido)
    {
        db.hacerPedido(pedido);
        return Response.status(201).entity("{\"result\":\"Añadir pedido\"}").type(MediaType.APPLICATION_JSON).build();

    }
}
