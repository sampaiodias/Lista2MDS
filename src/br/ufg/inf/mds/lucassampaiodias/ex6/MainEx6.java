/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.mds.lucassampaiodias.ex6;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucas
 */
public class MainEx6 extends Thread {
    static Carro jogador = new Carro("Schumas", 100, 5);
    static Carro computador = new Carro("PC Lixo", 100, 5);
        
    public static void main(String[] args) throws InterruptedException {
        boolean fimDeJogo = false;
        
        Scanner leitor = new Scanner(System.in);    
        
        System.out.println("CORRIDA MALUCA DO QUINTA!");
        System.out.println("Pressione Enter para aumentar/diminuir " +
                "sua velocidade.");
        Thread.sleep(5000);
        
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("GO!");
        
        //Uma thread controla os comandos do jogador e outra do computador,
        //fazendo com que os dois comandos sejam computados concomitantemente
        Computador meuComputador = new Computador();
        Thread t = new Thread(meuComputador);
        t.start();
        
        Jogador meuJogador = new Jogador();
        Thread j = new Thread(meuJogador);
        j.start();
        
        while(!fimDeJogo){ //Fluxo de jogo
            System.out.println(jogador.getNome() + 
                    ": Velocidade: " + jogador.getVelocidadeAtual() +
                    " Posição: " + jogador.getPosicaoX());
            System.out.println(computador.getNome() + 
                    ": Velocidade: " + computador.getVelocidadeAtual() +
                    " Posição: " + computador.getPosicaoX());
            
            System.out.println("\n\n\n\n\n"); //Não consegui limpar a tela
            
            jogador.atualizarPos();
            computador.atualizarPos();
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Computador.class.getName()).log(
                        Level.SEVERE, null, ex);
            }
            
            if (jogador.getPosicaoX() >= 1000){
                fimDeJogo = true;
                System.out.println("VOCÊ VENCEU!");
            }
            if (computador.getPosicaoX() >= 1000){
                fimDeJogo = true;
                System.out.println("O COMPUTADOR VENCEU! :(");
            }
        }
    }
    
    public static void controlarComputador(int num){
        computador.acelerar(num);
    }
    
    public static void controlarJogador(long num){
        jogador.acelerar(num);
    }
}
