/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.mergesort;

/**
 *
 * @author AgtLucas
 */
public class Aula04MergeSort {

    /**
     * @param args the command line arguments
     */
    
    public static void merge(String x[], int inicio, int fim) {
        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            merge(x, inicio, meio);
            merge(x, meio + 1, fim);
            intercala(x, inicio, fim, meio);
        }
    }
    
    public static void intercala(String x[], int inicio, int fim, int meio) {
        
    }
    
    public static void main(String[] args) {
        
    }
}
