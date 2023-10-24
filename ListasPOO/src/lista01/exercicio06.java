package lista01;

import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] Args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
         int C = entrada.nextInt();

         int F = (9 * C + 160)/5;

         System.out.println("A temperatura em graus Fahrenheit é " + F);
    }
}
