package br.unesp.rc.exercicio2.modelo;

import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Produto {
    
    private long codigo;
    private String nome;
    private double preco;
    private double desconto;

    

    public Produto(long codigo, String nome, double preco, double desconto) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }
    
    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    } 

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", desconto=" + desconto + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (int) (this.codigo ^ (this.codigo >>> 32));
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.preco) ^ (Double.doubleToLongBits(this.preco) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.desconto) ^ (Double.doubleToLongBits(this.desconto) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); 
    }
}
