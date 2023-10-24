package lista01;

import java.util.Scanner;

public class exercicio01 {
    public static void main (String [] Args){

        Scanner entrada = new Scanner(System.in);

        float estoque_medio;

        System.out.println("Digite a quantidade minima do produto: ");
         float quantidade_minima = entrada.nextFloat();

        System.out.println("Digite a quantidade máxima do produto: ");
         float quantidade_maxima = entrada.nextFloat();
         entrada.nextLine();

      estoque_medio = (quantidade_minima + quantidade_maxima)/2;

     System.out.println("O estoque medio da peça é " + estoque_medio);


    }
}
