package dev.lucaslowhan.curso1;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        menuConverter();
    }
    static void menuConverter(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("CONVERSÃO DE TEMPERATURAS");
            System.out.println("1- CELSIUS PARA FAHRENHEIT");
            System.out.println("2- FAHRENHEIT PARA CELSIUS");
            System.out.println("0- SAIR DA APLICAÇÃO");
            System.out.println("Escolha uma opção");
            int opcao = sc.nextInt();
            if (opcao ==0){
                System.exit(0);
            }
            System.out.println("Digite a temperatura que deseja converter:");
            double temperatura = sc.nextDouble();
            switch (opcao) {
                case 1:
                    converterTemperaturaCelsiusParaFahrenheit(temperatura);
                    break;
                case 2:
                    converterTemperaturaFahrenheitParaCelsius(temperatura);
                    break;
                default:
                    System.out.println("Opção incorreta.");
                    break;
            }
        }
    }
    static void converterTemperaturaCelsiusParaFahrenheit(double temperatura){
        double temperaturaFahrenheit = (temperatura * 1.8) + 32;
        System.out.println("Temperatura em Celsius: " + temperatura);
        System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit);
    }
    static void converterTemperaturaFahrenheitParaCelsius(double temperatura){
        double temperaturaCelsius= (temperatura - 32) / 1.8;
        System.out.println("Temperatura em Fahrenheit: " + temperatura);
        System.out.println("Temperatura em Celsius: " + temperaturaCelsius);
    }

}
