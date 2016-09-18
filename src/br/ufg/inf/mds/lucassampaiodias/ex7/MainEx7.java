/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.mds.lucassampaiodias.ex7;

import br.ufg.inf.mds.lucassampaiodias.Facilidades;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class MainEx7 {
    
    static List<Pessoa> pessoas = new ArrayList();
    
    public static void main(String[] args) {
        //List<Pessoa> pessoas = new ArrayList();
        mostrarMenu();
    }
    
    public static void menu(int opcao){
        String nome;
        String pai;
        String mae;
        Pessoa a;
        switch (opcao){
            case 1:
                nome = Facilidades.lerString("Insira o nome: ");
                a = new Pessoa(nome);
                pessoas.add(a);
                break;
            case 2:
                nome = Facilidades.lerString("Insira o nome: ");
                pai = Facilidades.lerString("Insira o nome do pai: ");
                mae = Facilidades.lerString("Insira o nome da mãe: ");
                a = new Pessoa(nome, new Pessoa(pai), new Pessoa(mae));
                pessoas.add(a);
                break;
            case 3:
                for(Pessoa x : pessoas){
                    System.out.println("\nNome: " + x.getNome() + "\nPai: " + 
                            x.getNomePai() + "\nMãe: " + x.getNomeMae() + "\n");
                }
                break;
            default:
                System.out.println("Opção inválida.\n");
                mostrarMenu();
        }
        mostrarMenu();
    }
    
    public static void mostrarMenu(){
        System.out.println("*************************************************");
        System.out.println("Escolha uma opção para começar:");
        System.out.println("1 - Cadastrar pessoa");
        System.out.println("2 - Cadastrar pessoa (com seus pais)");
        System.out.println("3 - Listar pessoas cadastradas");
        menu(Facilidades.lerNumero(""));
    }
}
