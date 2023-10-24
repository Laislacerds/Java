package lista03;

import java.util.Scanner;

public class exercicio42 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int numero;
            int maior = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;

            do {
                System.out.print("Digite um número , ou 0 para encerrar: ");
                numero = scanner.nextInt();

                if (numero != 0) {
                    if (numero > maior) {
                        maior = numero;
                    }

                    if (numero < menor) {
                        menor = numero;
                    }
                }
            } while (numero != 0);

            if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
                System.out.println("Nenhum número foi inserido.");
            } else {
                System.out.println("Maior número: " + maior);
                System.out.println("Menor número: " + menor);
            }

        }
    }

