package br.unitins.model;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Produto extends PanacheEntity {

    private String nomeProduto;
    private float valor;
    private String cor;
    private int garantia;
    private String fabricante;


    public String getNomeProduto(){
        return nomeProduto;
    }
    public void setNomeProduto(String n){
        nomeProduto = n;
    }
    public float getValor() {
        return valor;
    }
    public String getCor() {
        return cor;
    }
    public int getGarantia() {
        return garantia;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
