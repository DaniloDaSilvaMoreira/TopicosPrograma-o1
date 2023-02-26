package br.unitins.resource;

import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.unitins.model.Produto;

@Path("/produtos")
public class LojaResource {
    
    @GET
    public List<Produto> getAll() {

        return Produto.findAll().list();
    }

    @GET
    @Path("/{id}")
    public Produto get(@PathParam ("id") Long id) {

        Produto produto = Produto.findById(id);

        if (produto.isPersistent())        
            return Produto.findById(id);

        return null;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Produto insert (Produto produto) {

        produto.persist();

        return produto;
    }

    @DELETE
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public void delete(@PathParam ("id") Long id) {

        Produto produto = Produto.findById(id);

        if (produto.isPersistent())
            produto.delete();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Produto update (@PathParam ("id") Long id, Produto produto) {

        Produto entity = Produto.findById(id);

        entity.setNomeProduto(produto.getNomeProduto());

        entity.setValor(produto.getValor());

        entity.setCor(produto.getCor());

        entity.setGarantia(produto.getGarantia());

        entity.setFabricante(produto.getFabricante());

        return entity;
    }
}
