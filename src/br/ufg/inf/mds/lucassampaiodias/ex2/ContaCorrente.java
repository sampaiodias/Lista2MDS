/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.mds.lucassampaiodias.ex2;

/**
 *
 * @author aluno
 */
public class ContaCorrente {
    private float saldo;
    private String nomeProprietario;
    
    public ContaCorrente(float saldoInicial, String titularDaConta){
        this.saldo = saldoInicial;
        this.nomeProprietario = titularDaConta;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void sacar(float montante){
        if (montante > 0){
            this.saldo -= montante;
        }
    }
    
    public void depositar(float montante){
        if (montante > 0){
           this.saldo += montante; 
        }
    }
}
