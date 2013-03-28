/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04.mergesort;
import java.util.Scanner;
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
        int posLivre = inicio, inicioVetor1 = inicio, inicioVetor2 = meio + 1, i;
        String aux[] = new String[20];
        while (inicioVetor1 <= meio && inicioVetor2 <= fim) {
            if (x[inicioVetor1].compareTo(x[inicioVetor2]) <= 0) {
                aux[posLivre] = x[inicioVetor1];
                inicioVetor1++;
            } else {
                aux[posLivre] = x[inicioVetor2];
                inicioVetor2++;
            }
            posLivre++;
        }
        
        for (i = inicioVetor1; i <= meio; i++) {
            aux[posLivre] = x[i];
            posLivre++;
        }
        
        for (i = inicioVetor2; i <= fim; i++) {
            aux[posLivre] = x[i];
            posLivre++;
        }
        
        for (i = inicio; i <= fim; i++) {
            x[i] = aux[i];
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String x[] =  new String[20];
        int i;
        
        for (i = 0; i <= 19; i++) {
            System.out.println("Digite a " + (i + 1) + "º palavra: ");
            x[i] = in.next();
        }
        
        merge(x, 0, 19);
        
        int imp = 1;
        
        System.out.println(" ");
        System.out.println("Palavras que iniciam com vogais: ");
        
        for (i = 0; i <= 19; i++) {
            if (x[i].toUpperCase().charAt(0) == 'A' || x[i].toUpperCase().charAt(0) == 'E' || x[i].toUpperCase().charAt(0) == 'I' || x[i].toUpperCase().charAt(0) == 'O' || x[i].toUpperCase().charAt(0) == 'U') {
                System.out.println(imp + "º palavra: " + x[i]);
                imp++;
            }
        }
    }
}
