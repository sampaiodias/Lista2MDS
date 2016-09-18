/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.mds.lucassampaiodias.ex6;

/**
 *
 * @author lucas
 */
public class Carro {
    private String nome;
    private float velocidadeAtual;
    private float velocidadeMax;
    private int potencia;
    private int posX;
    
    public Carro(String nome, float velocidadeMaxima, int potencia){
        this.nome = nome;
        this.velocidadeMax = velocidadeMaxima;
        this.potencia = potencia;
        velocidadeAtual = 0;
    }
    
    public void acelerar(long valorParOuImpar){
        if(valorParOuImpar % 2 == 0){
            this.velocidadeAtual += this.potencia;
            if (this.velocidadeAtual > this.velocidadeMax){
                this.velocidadeAtual = this.velocidadeMax;
            }
        }
        else{
            this.velocidadeAtual -= this.potencia;
        }
    }
    
    public float getVelocidadeAtual(){
        return this.velocidadeAtual;
    }
    
    public int getPosicaoX(){
        return this.posX;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void atualizarPos(){
        this.posX += velocidadeAtual;
    }
}
