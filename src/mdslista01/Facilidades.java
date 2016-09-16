/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mdslista01;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Facilidades {
    public static int lerNumero(String texto)
    {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println(texto);
        return Integer.parseInt(leitor.nextLine());
    }
    
    public static double menorDouble(double[] vetor){
        double resultado = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < resultado) {
                resultado = vetor[i];
            }
        }
        
        return resultado;
    }
    
    public static int contaPrimos(int[] vetor){
        int cont = 0;
        
        for (int i = 0; i < vetor.length; i++){
            if (verificarPrimo(vetor[i])){
                cont++;
            }
        }
        
        return cont;
    }
    
    public static boolean verificarPrimo(int i){
         boolean isPrime = true;
                       
            //check to see if the number is prime
            for(int j=2; j < i ; j++){

                    if(i % j == 0){
                            isPrime = false;
                            break;
                    }
            }
            
        return isPrime;
    }
}


