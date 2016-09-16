/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufg.inf.mds.lucassampaiodias.ex4;
import br.ufg.inf.mds.lucassampaiodias.Facilidades;

/**
 *
 * @author lucas
 */
public class MainEx4 {
    public static void main(String[] args) {
        Contato[] agenda = new Contato[1];
        for (int i = 0; i < agenda.length; i++){
            String nome = Facilidades.lerString("Insira o nome do contato: ");
            String num = Facilidades.lerString("Insira o número do contato: ");
            agenda[i] = new Contato(nome, num);
            
            if (agenda[i].getNumero() == "NÚMERO INVÁLIDO"){
                System.out.println("\nERRO! "
                        + "O número inserido não pode conter caracteres. "
                        + "Por favor, insira o contato novamente.");
                i--;
            }
        }
        System.out.println("\nContatos cadastrados:");
        for (int i = 0; i < agenda.length; i++){
            System.out.println("Nome: " + agenda[i].getNome() + 
                    " - Número: " + agenda[i].getNumero());
        }
    }
}
