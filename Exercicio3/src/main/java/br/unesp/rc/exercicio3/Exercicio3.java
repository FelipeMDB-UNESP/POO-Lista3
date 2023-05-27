/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.unesp.rc.exercicio3;

import br.unesp.rc.exercicio3.modelo.Carro;
import br.unesp.rc.exercicio3.modelo.Montadora;

/**
 *
 * @author aluno
 */
public class Exercicio3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Montadora volkswagen = new Montadora("Volkswagen", "America");
        Montadora chevrolet = new Montadora("Chevrolet", "Brasil");
        Carro carro1 = new Carro("Cobalt", "2004", "2004", 20000.00);
        Carro carro2 = new Carro("Jetta", "2023", "2023", 70000.00);
        
        
        
        volkswagen.criarCarro(carro2);
        chevrolet.criarCarro(carro2);
        
    }
}
