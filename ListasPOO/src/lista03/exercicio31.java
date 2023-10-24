package lista03;

import java.util.Scanner;

public class exercicio31{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaPares = 0;
        int somaImpares = 0;

        while (true) {
            System.out.print("Digite um número positivo ,ou um número negativo para encerrar: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero % 2 == 0) {
                System.out.println(numero + " é par.");
                somaPares += numero;
            } else {
                System.out.println(numero + " é ímpar.");
                somaImpares += numero;
            }
        }

        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);

    }
}
