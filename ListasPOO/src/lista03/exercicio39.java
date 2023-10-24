package lista03;

import java.util.Scanner;

public class exercicio39 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char encerrar;

            do {
                System.out.print("Digite um número inteiro: ");
                int numero = scanner.nextInt();

                if (numero % 2 == 0) {
                    System.out.println("O número é par.");
                } else {
                    System.out.println("O número é ímpar.");
                }

                if (numero > 0) {
                    System.out.println("O número é positivo.");
                } else if (numero < 0) {
                    System.out.println("O número é negativo.");
                } else {
                    System.out.println("O número é zero.");
                }

                System.out.print("Deseja encerrar o programa (S/n)? ");
                encerrar = scanner.next().charAt(0);
            } while (encerrar != 'S' && encerrar != 's');

        }
    }


