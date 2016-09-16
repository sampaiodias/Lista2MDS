/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.mds.lucassampaiodias.ex4;

/**
 *
 * @author lucas
 */
public class Contato {
    private String nome;
    private String numero;
    
    public Contato (String nome, String numero){
        this.nome = nome;
        setNumero(numero);
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getNumero(){
        return this.numero;
    }
    
    public void setNumero(String numero){
        if (!temLetraEmString(numero)){
            this.numero = numero;
        }
        else{
            this.numero = "NÚMERO INVÁLIDO";
        }
    }
    
    public static boolean temLetraEmString(String texto){
        for (char letra : texto.toCharArray())  {
            if(letra < '0' || letra > '9') {
               return true;
            }               
        }  
        return false;
    }
}
