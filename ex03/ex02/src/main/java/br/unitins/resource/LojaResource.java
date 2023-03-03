package br.unitins.resource;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.unitins.model.Produto;
import br.unitins.repository.*;

@Path("/produtos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class LojaResource {
    
    @Inject
    private ProdutoRepository repository;

    @GET
    public List<Produto> getAll() {
        return repository.findAll().list(); 
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Produto insert (Produto produto) {
        produto.persist();
        return produto;
    }

    @PUT
    @Path("alterbyid/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Produto update (@PathParam ("id") Long id, Produto produto) {

        Produto entity = repository.findById(id);

        entity.setNomeProduto(produto.getNomeProduto());
        entity.setValor(produto.getValor());
        entity.setCor(produto.getCor());
        entity.setGarantia(produto.getGarantia());
        entity.setFabricante(produto.getFabricante());

        return entity;
    }

    @GET
    @Path("/quantidade")
    public long count(){
        return repository.count();
    }

    @GET
    @Path("/nome/{nome}")
    public List<Produto> searchByName(@PathParam("nome") String nome) {
    return repository.findByNomeIgnoreCase(nome);
    }
}
