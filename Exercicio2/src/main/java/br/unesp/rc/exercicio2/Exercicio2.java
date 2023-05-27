/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.unesp.rc.exercicio2;

import br.unesp.rc.exercicio2.modelo.Carrinho;
import br.unesp.rc.exercicio2.modelo.Produto;

/**
 *
 * @author aluno
 */
public class Exercicio2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        Produto lapis = new Produto(1, "Lápis Faber Castell", 1.00, 0.00);
        Produto caneta = new Produto(2, "Caneta Bic", 2.00, 0.00);
        Produto borracha = new Produto(3, "Borracha Miolo de Pão", 4, 0.50);
        
        Carrinho carrinho1 = new Carrinho();
        carrinho1.inserirProduto(lapis, 2);
        carrinho1.listarProdutos();
        carrinho1.inserirProduto(lapis, 2);
        carrinho1.listarProdutos();
        carrinho1.removerProduto(lapis, 3);
        carrinho1.listarProdutos();
        carrinho1.removerProduto(lapis, 3);
        carrinho1.listarProdutos();
        carrinho1.inserirProduto(caneta, 2);
        carrinho1.inserirProduto(borracha, 1);
        System.out.println("Custo total: R$" + carrinho1.calcularCusto());
        
    }
}
