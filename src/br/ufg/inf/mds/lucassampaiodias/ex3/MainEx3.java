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
public class MainEx3 {
    public static void main(String[] args) {
        Data dataEspecial = new Data(10, 02, 1995);
        dataEspecial.setDia(28);
        System.out.println(dataEspecial.getData());
    }
}
