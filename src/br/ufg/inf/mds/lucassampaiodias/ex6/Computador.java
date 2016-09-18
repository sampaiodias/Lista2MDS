/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.mds.lucassampaiodias.ex6;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucas
 */
public class Computador implements Runnable {
    
    public Computador(){
        
    }   
    
    public void run(){
        while(true){
            Random aleatorio = new Random();
            int valor = aleatorio.nextInt(100);
            if (valor > 55){ //% de chance de acelerar
                MainEx6.controlarComputador(2);
            }
            else{
                MainEx6.controlarComputador(1);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Computador.class.getName()).log(
                        Level.SEVERE, null, ex);
            }
        }
    }
}
