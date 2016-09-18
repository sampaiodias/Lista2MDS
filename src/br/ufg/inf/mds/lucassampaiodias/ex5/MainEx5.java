/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.mds.lucassampaiodias.ex5;

import br.ufg.inf.mds.lucassampaiodias.Facilidades;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class MainEx5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean fimDeJogo = false;
        Cartela jogador = new Cartela();
        Cartela computador = new Cartela();
        int[] numSorteados = new int[30];
        int qtdSorteios = -1;
        Random aleatorio = new Random();
        
        System.out.println("********* B I N G O ***********");
        System.out.println("Pressione Enter para começar...");
        leitor.nextLine();
        anunciarCartelas(jogador, computador);
        
        while (!fimDeJogo){
            System.out.println("Para sortear mais um número, aperte Enter...");
            leitor.nextLine();
            
            int bola = 0;
            boolean valorJaSorteado = true;
            while(valorJaSorteado){
                bola = aleatorio.nextInt(31);
                if (bola == 0){
                    bola++;
                }
                if (!Facilidades.existeValorNoVetor(bola, numSorteados)){
                    qtdSorteios++;
                    numSorteados[qtdSorteios] = bola;
                    valorJaSorteado = false;
                }
            }
            
            System.out.println("Bola sorteada... número " + bola + "!");
            jogador.tentarMarcar(bola);
            computador.tentarMarcar(bola);
            
            System.out.println("Para prosseguir, aperte Enter...");
            leitor.nextLine();

            anunciarCartelas(jogador, computador);
            if(jogador.verificarBingo()){
                System.out.println("BINGO DO JOGADOR!");
                fimDeJogo = true;
            }
            if(computador.verificarBingo()){
                System.out.println("BINGO DO COMPUTADOR!");
                fimDeJogo = true;
            }
        }
    }
    
    public static void anunciarCartelas(Cartela jogador, Cartela computador){
        System.out.println("Cartela do Jogador:");
        System.out.println(jogador.getValoresCartela());
        System.out.println("Cartela do Computador:");
        System.out.println(computador.getValoresCartela());
    }
}
