/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.mds.lucassampaiodias.ex1;

/**
 *
 * @author aluno
 */
public class Contador {
    
    private int valor;
    
    public Contador(int valor){
        this.valor = valor;
    }
    
    public void zerar(){
        valor = 0;
    }
    
    public void incrementar(){
        valor++;
    }
    
    public int getValor(){
        return this.valor;
    }
}


