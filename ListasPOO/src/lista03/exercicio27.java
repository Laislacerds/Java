package lista03;

import java.util.Scanner;

public class exercicio27 {

    public static void main (String[] Args){


     Scanner entrada = new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números a serem processados: ");
        int quantidade = scanner.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o número: " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            long fatorial = 1;

            for (int j = 1; j <= numero; j++) {
                fatorial *= j;
            }

            System.out.println("O fatorial de " + numero + " é " + fatorial);
        }

    }

}
