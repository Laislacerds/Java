package lista01;

import java.util.Scanner;

public class exercicio08 {

    public static void main(String[] Args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do radio da lata de óléo: ");
         Double R = entrada.nextDouble();

        System.out.println("Digite o valor da altura da lata de óleo: ");
        Double A = entrada.nextDouble();

        Double V = 3.14159 * R * R * A;

        System.out.println("O valor do volume da lata de óleo é: " + V);


    }
}
