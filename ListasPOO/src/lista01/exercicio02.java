package lista01;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] Args) {

        Scanner entrada = new Scanner(System.in);

         float conversao;

        System.out.println("Digite a cotação do dolar: ");
         float cotacao = entrada.nextFloat();

        System.out.println("Digite quantos dolares você tem na carteira: ");
          float dolares = entrada.nextFloat();

        conversao = (dolares * cotacao);

       System.out.println("O valor em reais é: " + conversao);

    }
}