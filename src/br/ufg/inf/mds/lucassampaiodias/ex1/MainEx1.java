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
public class MainEx1 {
    public static void main(String[] args) {
        Contador contador = new Contador(0);
        contador.incrementar();
        System.out.println("Valor atual: "+ contador.getValor());
        contador.zerar();
        System.out.println("Valor atual: "+ contador.getValor());
    }    
}
