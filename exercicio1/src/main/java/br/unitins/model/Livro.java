package br.unitins.model;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Livro extends PanacheEntity{
    private String nomeLivro;
    private int anoPublicação;
    private String autor;
    private String categoria;
    private String paisOrigem;

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }
    public void setAnoPublicação(int anoPublicação) {
        this.anoPublicação = anoPublicação;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
    public String getNomeLivro() {
        return nomeLivro;
    }
    public int getAnoPublicação() {
        return anoPublicação;
    }
    public String getAutor() {
        return autor;
    }
    public String getCategoria() {
        return categoria;
    }
    public String getPaisOrigem() {
        return paisOrigem;
    }

}
