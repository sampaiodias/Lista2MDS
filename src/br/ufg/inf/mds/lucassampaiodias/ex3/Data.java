/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.mds.lucassampaiodias.ex3;

/**
 *
 * @author aluno
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int dia, int mes, int ano){
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }
    
    public void setDia(int num){
        if (num > 0 && num <= 31){
            if (this.mes == 4 || this.mes == 6 ||
                    this.mes == 9 || this.mes == 11){
                if (num <= 30){
                    this.dia = num;
                }
            }
            else{
                if (mes == 2){
                    if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
                        if (num <= 29){
                            this.dia = num;
                        }
                    } 
                    else{
                        if (num <= 28){
                            this.dia = num;
                        }
                    }
                }
                else{
                    this.dia = num;
                }
            }
        }
    }
    
    public void setMes(int num){
        if (num > 0 && num <= 12){
            this.mes = num;
        }
    }
    
    public void setAno(int num){
        if (num > 0){
            this.ano = num;
        }
    }
    
    public String getData(){
        String diaTexto = "" + this.dia;
        String mesTexto = "" + this.mes;
        if (this.dia < 10){
            diaTexto = "0" + this.dia;
        }
        if (this.mes < 10){
            mesTexto = "0" + this.mes;
        }
        
        return (diaTexto + "/" + mesTexto + "/" + this.ano);
    }
}
