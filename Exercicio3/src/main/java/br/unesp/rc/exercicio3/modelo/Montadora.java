/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.exercicio3.modelo;

import java.util.HashMap;
import java.util.Map;
import br.unesp.rc.exercicio3.modelo.Carro;
/**
 *
 * @author aluno
 */
public class Montadora {
    private String nome;
    private String paisSede;

    private HashMap<Carro, Montadora> mapaCarros;
    
    public Montadora(String nome, String paisSede) {
        this.nome = nome;
        this.paisSede = paisSede;
        HashMap<Carro, Montadora> mapaCarros = new HashMap<Carro, Montadora>();
    }

    public Montadora() {
    }
    
    
    public void criarCarro(Carro carro){
        if(mapaCarros.containsKey(carro)){
            System.out.println("Carro já patenteado!");
        }else{
            mapaCarros.put(carro, this);
            System.out.println("Carro criado com sucesso");
        }
    }
    
    //------------------------------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaisSede() {
        return paisSede;
    }

    public void setPaisSede(String paisSede) {
        this.paisSede = paisSede;
    }
    
    
}
