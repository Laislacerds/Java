package lista03;

import java.util.Scanner;

public class exercicio30 {
    public static void main (String[] Args){

        Scanner entrada = new Scanner(System.in);

        int i;
        int num;
        int limite = 10;

        System.out.println("Digite um numero: ");
         num = entrada.nextInt();

         for(i = 1; i <= limite; i++){

             int resultado = num * i;

             System.out.println(num + " x " + i + " = " + resultado);
         }

    }

}
