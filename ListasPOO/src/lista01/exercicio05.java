package lista01;

import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] Args){

        Scanner entrada  = new Scanner(System.in);

        System.out.println("Digite o tempo gasto na viagem (em horas): ");
         float tempo = entrada.nextFloat();

         System.out.println("Digite a velocidade média (em Km): ");
         float velocidade = entrada.nextFloat();

         float distancia = tempo * velocidade;

         float litros_usados = distancia / 12;

         System.out.println("O valor da velocidade média foi \n"+ velocidade
                 + " km"+", O valor do seu tempo gasto foi \n"
                 + tempo + " ,O valor da distância percorrida foi \n"
                 + distancia + ",A quantidade de litros utilizada na viagem foi \n" + litros_usados);

    }

}
