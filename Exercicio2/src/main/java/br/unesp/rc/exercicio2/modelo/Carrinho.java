/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.exercicio2.modelo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author aluno
 */
public class Carrinho {
    private HashMap<Produto, Integer> mapaDeProdutos;

    public Carrinho() {
        
        mapaDeProdutos = new HashMap<Produto, Integer>();
    }
    
    public void inserirProduto(Produto p, int quantidade){
        if(mapaDeProdutos.containsKey(p)){
            mapaDeProdutos.merge(p, quantidade, Integer::sum);
        }else{
            mapaDeProdutos.put(p, quantidade);
        }
    }
    
    public boolean removerProduto(Produto p, int quantidade){
        if(mapaDeProdutos.containsKey(p)){
            if(mapaDeProdutos.get(p) <= quantidade){
                mapaDeProdutos.remove(p);
                return true;
            }
            mapaDeProdutos.merge(p, quantidade*-1, Integer::sum);
            return true;
        }
        return false;
    }
    
    public HashMap<Produto, Integer> getMapaDeProdutos() {
        return mapaDeProdutos;
    }

    public void setMapaDeProdutos(HashMap<Produto, Integer> mapaDeProdutos) {
        this.mapaDeProdutos = mapaDeProdutos;
    }  

    public void listarProdutos() {
        
        if(mapaDeProdutos.isEmpty()){
            System.out.println("Lista vazia!");
        }else{
            mapaDeProdutos.forEach((key, value)->
            {
                System.out.println(key.toString());
                System.out.println("Quantidade:" + value);
            });
        }
    }
    public double calcularCusto(){
        double total = 0;
        for (Map.Entry<Produto, Integer> mapEntry : mapaDeProdutos.entrySet()) {
            total += (1.00 - mapEntry.getKey().getDesconto()) *mapEntry.getKey().getPreco() * mapEntry.getValue();
            
        }
        return total;
    }
    
}
