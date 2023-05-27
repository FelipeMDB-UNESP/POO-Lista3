package br.unesp.rc.exercicio1;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author aluno
 */
public class Exercicio1 {

    public static void main(String[] args) {
        
        
        Vector<Integer> vetor = new Vector<Integer>();
        Scanner teclado = new Scanner(System.in);
        
        int cont = 0;
        
        for (;cont<14; cont ++) {
            int numero = teclado.nextInt();
            vetor.add(numero);
        }
        
        
        Collections.sort(vetor,Comparator.reverseOrder());
        for(Integer i : vetor){
            System.out.println("" + i);
        }
    }
}
