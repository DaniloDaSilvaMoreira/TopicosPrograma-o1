package br.unitins.repository;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import br.unitins.model.Produto;

@ApplicationScoped
public class ProdutoRepository implements PanacheRepository<Produto>{
   
    public List<Produto> findByNomeIgnoreCase(String nome) {
        return find("LOWER(nome) LIKE LOWER(concat('%', ?1, '%'))", nome).list();
    }
}
