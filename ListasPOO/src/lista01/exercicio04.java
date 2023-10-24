package lista01;

import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] Args){

        Scanner entrada  = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
            int A = entrada.nextInt();

        System.out.println("Digite o valor de B: ");
            int B = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Digite o valor de C: ");
            int C = entrada.nextInt();

        System.out.println("Digite o valor de D: ");
            int D = entrada.nextInt();

         int resultado1 = A + B;
         int resultado2 = A + C;
         int resultado3 = A + D;
         int resultado4 = B + C;
         int resultado5 = B + D;
         int resultado6 = C + D;

        int resultadoM1 = A * B;
        int resultadoM2 = A * C;
        int resultadoM3 = A * D;
        int resultadoM4 = B * C;
        int resultadoM5 = B * D;
        int resultadoM6 = C * D;


        System.out.println("Resultados da adição:");
        System.out.println("A + B = " + resultado1);
        System.out.println("A + C = " + resultado2);
        System.out.println("A + D = " + resultado3);
        System.out.println("B + C = " + resultado4);
        System.out.println("B + D = " + resultado5);
        System.out.println("C + D = " + resultado6);

        System.out.println("Resultados da multiplicação:");
        System.out.println("A * B = " + resultadoM1);
        System.out.println("A * C = " + resultadoM2);
        System.out.println("A * D = " + resultadoM3);
        System.out.println("B * C = " + resultadoM4);
        System.out.println("B * D = " + resultadoM5);
        System.out.println("C * D = " + resultadoM6);



    }
}
