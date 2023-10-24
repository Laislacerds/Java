package lista03;

import java.util.Scanner;

public class exercicio34 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int numero;
            int maior = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;

            while (true) {
                System.out.print("Digite um número positivo (ou um número negativo para encerrar): ");
                numero = scanner.nextInt();

                if (numero < 0) {
                    break;
                }

                if (numero > maior) {
                    maior = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }
            }

            if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
                System.out.println("Nenhum número positivo foi inserido.");
            } else {
                System.out.println("Maior número: " + maior);
                System.out.println("Menor número: " + menor);
            }

            scanner.close();
        }
    }


