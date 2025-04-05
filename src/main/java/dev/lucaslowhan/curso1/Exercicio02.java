package dev.lucaslowhan.curso1;

import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int tentativa = 0;
        int numeroUsuario = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero de 1 a 100");
            numeroUsuario = sc.nextInt();
            if(numeroUsuario==numeroAleatorio){
                tentativa++;
                System.out.println("Você acertou o numero, em " + tentativa + " tentativas");
                break;
            }else if(numeroUsuario<numeroAleatorio){
                System.out.println("O numero aleatorio é maior.");
                tentativa++;
            }else if(numeroUsuario>numeroAleatorio){
                System.out.println("O numero aleatorio é menor.");
                tentativa++;
            }
            if(tentativa==5){
                System.out.println("Você não conseguiu com 5 tentativas.");
            }
        }

    }
}
