package lista01;

import java.util.Scanner;

public class exercicio09 {

    public static void main(String[] Args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o ano que você nasceu: ");
        int ano = entrada.nextInt();

        System.out.println("Digite o mês que você nasceu: ");
        int mes = entrada.nextInt();

        System.out.println("Digite o dia que você nasceu: ");
        int dia = entrada.nextInt();

        int idade = (ano * 365) + (mes * 30) + dia;


        System.out.println("a idade em dias é " + idade + " dias");

    }
}
