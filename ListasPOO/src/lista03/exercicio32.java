package lista03;

import java.util.Scanner;

public class exercicio32 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número maior que zero e menor que 10: ");
            int numero = scanner.nextInt();

            if (numero > 0 && numero < 10) {
                int somaQuadradosImpares = 0;
                int contador = 0;

                while (contador < 20) {
                    if (numero % 2 != 0) {
                        somaQuadradosImpares += numero * numero;
                        contador++;
                    }
                    numero++;
                }

                System.out.println("A soma dos quadrados dos 20 primeiros números" +
                        " ímpares a partir de " + (numero - 20) + " é: " + somaQuadradosImpares);
            } else {
                System.out.println("O número informado não está no intervalo válido.");
            }

            scanner.close();
        }
    }



