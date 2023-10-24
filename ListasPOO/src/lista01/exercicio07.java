package lista01;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] Args){

        Scanner entrada = new Scanner(System.in);

            System.out.println("Digite a temperatura em Fahrenheit: ");
             int F = entrada.nextInt();

              int C = (F - 32) * 5 / 9 ;

              System.out.println("A temperatura em graus Celsius é: " + C);

    }
}
