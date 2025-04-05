package dev.lucaslowhan.curso1;

import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(10);
        int tentativa = 0;
        int numeroUsuario = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero de 1 a 100");
            numeroUsuario = sc.nextInt();
            if(numeroUsuario==numeroAleatorio){
                tentativa++;
                System.out.println("Você acertou o numero, em " + tentativa + " tentativas");
                break;
            }else{
                System.out.println("Tente novamente.");
                tentativa++;
            }
        }

    }
}
