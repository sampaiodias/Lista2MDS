/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.mds.lucassampaiodias;

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
    
    public static String lerString(String texto)
    {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println(texto);
        return (leitor.nextLine());
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
    
    public static boolean verificarPrimo(int n){
             // fast even test.
        if(n > 2 && (n & 1) == 0)
           return false;
        // only odd factors need to be tested up to n^0.5
        for(int i = 3; i * i <= n; i += 2)
            if (n % i == 0) 
                return false;
        return true;
    }
    
    public static int[][] ordenarMatriz(int[][] matriz, 
            int linhas, int colunas){
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                for(int x = 0; x < linhas; x++){
                    for(int y = 0; y < colunas; y++){
                        if(matriz[i][j] < matriz[x][y]){
                            int t = matriz[i][j];
                            matriz[i][j] = matriz[x][y];
                            matriz[x][y] = t;
                        }
                    }
                }
            }   
        }
        return matriz;
    }
    
    public static boolean existeValorNoVetor(int valor, int[] vetor){
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] == valor){
                return true;
            }
        }
        return false;
    }
}


