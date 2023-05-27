/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.exercicio3.modelo;

/**
 *
 * @author aluno
 */
public class Carro {
    private String nome;
    private String modelo;
    private String anoDeProjeto;
    private double valorDeCusto;

    public Carro(String nome, String modelo, String anoDeProjeto, double valorDeCusto) {
        this.nome = nome;
        this.modelo = modelo;
        this.anoDeProjeto = anoDeProjeto;
        this.valorDeCusto = valorDeCusto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnoDeProjeto() {
        return anoDeProjeto;
    }

    public void setAnoDeProjeto(String anoDeProjeto) {
        this.anoDeProjeto = anoDeProjeto;
    }

    public double getValorDeCusto() {
        return valorDeCusto;
    }

    public void setValorDeCusto(double valorDeCusto) {
        this.valorDeCusto = valorDeCusto;
    }
    
    
}
