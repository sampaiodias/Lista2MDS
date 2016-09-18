/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.mds.lucassampaiodias.ex5;

import br.ufg.inf.mds.lucassampaiodias.Facilidades;
import java.util.Random;

/**
 *
 * @author lucas
 */
public class Cartela {
    private int[][] matrizNumeros = new int[3][3];
    private boolean[][] matrizSorteados = new boolean[3][3];
    
    public Cartela(){
        preencherCartela();
        this.matrizNumeros = Facilidades.ordenarMatriz(this.matrizNumeros, 3, 3);
    }
    
    private void preencherCartela(){
        Random aleatorio = new Random();
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                int valor = aleatorio.nextInt(31);
                boolean elementoPreenchido = false;
                if (valor == 0){
                    valor++;
                }
                while(!elementoPreenchido){
                    if (temValor(valor)){
                        valor = aleatorio.nextInt(31);
                        if (valor == 0){
                            valor ++;
                        }
                    }
                    else{
                        this.matrizNumeros[i][j] = valor;
                        elementoPreenchido = true;
                    }
                }
            }
        }
    }
    
    public boolean temValor(int valor){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (this.matrizNumeros[i][j] == valor){
                    return true;
                }
            }
        }
        return false;
    }
    
    public String getValoresCartela(){
        String texto = "";
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (this.matrizSorteados[i][j]){
                    texto += "XX ";
                }
                else{
                    if (this.matrizNumeros[i][j] < 10){
                        texto += "0";
                    }
                    texto += this.matrizNumeros[i][j] + " ";
                }
            }
            texto += "\n";
        }
        
        return texto;
    }
    
    public void tentarMarcar(int valorSorteado){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (this.matrizNumeros[i][j] == valorSorteado){
                    this.matrizSorteados[i][j] = true;
                }
            }
        }
    }
    
    public boolean verificarBingo(){
        if (this.matrizSorteados[0][0] &&  
                this.matrizSorteados[0][1] &&
                this.matrizSorteados[0][2]){ //LINHA 1
            return true;
        }
        if (this.matrizSorteados[1][0] && 
                this.matrizSorteados[1][1] &&
                this.matrizSorteados[1][2]){ //LINHA 2
            return true;
        }
        if (this.matrizSorteados[2][0] && 
                this.matrizSorteados[2][1] &&
                this.matrizSorteados[2][2]){ //LINHA 3
            return true;
        }
        if (this.matrizSorteados[0][0] &&  
                this.matrizSorteados[1][0] &&
                this.matrizSorteados[2][0]){ //COLUNA 1
            return true;
        }
        if (this.matrizSorteados[0][1] &&  
                this.matrizSorteados[1][1] &&
                this.matrizSorteados[2][1]){ //COLUNA 2
            return true;
        }
        if (this.matrizSorteados[0][2] &&  
                this.matrizSorteados[1][2] &&
                this.matrizSorteados[2][2]){ //COLUNA 3
            return true;
        }
        if (this.matrizSorteados[0][0] &&  
                this.matrizSorteados[1][1] &&
                this.matrizSorteados[2][2]){ //DIAGONAL \
            return true;
        }
        if (this.matrizSorteados[0][2] &&  
                this.matrizSorteados[1][1] &&
                this.matrizSorteados[2][0]){ //DIAGONAL /
            return true;
        }
        return false;
    }
}
