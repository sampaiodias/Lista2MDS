/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.mds.lucassampaiodias.ex6;

import br.ufg.inf.mds.lucassampaiodias.Facilidades;

/**
 *
 * @author lucas
 */
public class Jogador implements Runnable{
    
    public Jogador(){
        
    }   
    
    public void run(){
        while(true){    
            
            if(Facilidades.lerString("") != null){
                MainEx6.controlarJogador(System.currentTimeMillis());
            }
        }
    }
           
}
