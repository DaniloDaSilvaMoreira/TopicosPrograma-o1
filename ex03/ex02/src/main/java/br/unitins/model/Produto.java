package br.unitins.model;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 80)
    private String nomeProduto;

    @Column(nullable = false)
    private float valor;

    @Column(nullable = false, length = 14)
    private String cor;

    @Column(nullable = false)
    private int garantia;

    @Column(nullable = false, length = 60)
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

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public static Object findAll() {
        return null;
    }
    public void persist() {
    }
    public Produto findById(Long id2) {
        return null;
    }
}
