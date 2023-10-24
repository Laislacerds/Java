package lista03;

import java.util.Scanner;

public class exercicio36 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int maior = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;
            int soma = 0;

            for (int i = 1; i <= 10; i++) {
                System.out.print("Digite um valor inteiro e positivo: ");
                int numero = scanner.nextInt();

                if (numero < 0) {
                    System.out.println("Valor inválido. Digite um valor positivo.");
                    i--;
                } else {
                    soma += numero;

                    if (numero > maior) {
                        maior = numero;
                    }

                    if (numero < menor) {
                        menor = numero;
                    }
                }
            }

            double media = (double) soma / 10;

            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
            System.out.println("Média dos valores: " + media);


        }
    }


