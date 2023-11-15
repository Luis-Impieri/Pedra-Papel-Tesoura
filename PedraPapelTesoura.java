/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pedra.papel.tesoura;
import java.util.Random;
import java.util.Scanner;
public class PedraPapelTesoura {

    public static void main(String[] args) {    
        Scanner teclado = new Scanner(System.in);
        String jogador;
        int computador;
        String compjogada = "";
        System.out.println("Escolha sua jogada: Pedra, Papel ou Tesoura");
        jogador = teclado.nextLine();
        System.out.println("Voce escolheu: " + jogador);
        Random escolha = new Random();
        computador = escolha.nextInt(3);
        switch(computador) {
            case 0:
                compjogada = "Pedra";
                System.out.println("Computador escolheu: " + compjogada);
                break;
            case 1:
                compjogada = "Papel";
                System.out.println("Computador escolheu: " + compjogada);
                break;
            case 2:
                compjogada = "Tesoura";
                System.out.println("Computador escolheu: " + compjogada);
                break;
        }
        
        if(jogador.equals(compjogada)) {
    System.out.println("Empate!");
        } else if (jogador.equals("Pedra")) {
            if (compjogada.equals("Papel")) {
                System.out.println("Voce perdeu");
            } if (compjogada.equals("Tesoura")) {
                System.out.println("Voce venceu");
            }
        } else if (jogador.equals("Papel")) {
            if (compjogada.equals("Tesoura")) {
                System.out.println("Voce perdeu");
            } if (compjogada.equals("Pedra")) {
                System.out.println("Voce venceu");
            }
        } else if (jogador.equals("Tesoura")) {
            if (compjogada.equals("Pedra")) {
                System.out.println("Voce perdeu");
            } if (compjogada.equals("Papel")) {
                System.out.println("Voce venceu");
            }
        } else {
            System.out.println("Escolha uma jogada valida");
        }
        
        
    }
}
