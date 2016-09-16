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
public class MainEx2 {
    public static void main(String[] args) {
        ContaCorrente minhaConta = new ContaCorrente(
                500, "Lucas Sampaio Dias");
        minhaConta.depositar(100);
        minhaConta.sacar(200);
        System.out.println("Saldo: " + minhaConta.getSaldo());
    }
}
