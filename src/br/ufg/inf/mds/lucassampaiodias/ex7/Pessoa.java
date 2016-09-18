/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.mds.lucassampaiodias.ex7;

/**
 *
 * @author lucas
 */
public class Pessoa {
    private String nome;
    private Pessoa pai;
    private Pessoa mae;
    
    public Pessoa(String nome, Pessoa pai, Pessoa mae){
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
    }
    
    public Pessoa(String nome){
        this.nome = nome;
        this.pai = null;
        this.mae = null;
    }
    
    public boolean igualdadeSemantica(Pessoa b){
        return this.nome == b.getNome() && this.getNomeMae() == b.getNomeMae();
    }
    
    public boolean isIrmao(Pessoa b){
        return this.getNomePai() == b.getNomePai() && 
                this.getNomeMae() == b.getNomeMae();
    }
    
    public boolean isAntecessor(Pessoa b){
        return this.getNomePai() == b.getNome() || 
                this.getNomeMae() == b.getNome();
    }
    
    public String getNome(){
        if (this.nome == null){
            return "";
        }
        return this.nome;
    }
    
    public String getNomeMae(){
        return this.mae.getNome();
    }
    
    public String getNomePai(){
        return this.pai.getNome();
    }
}
