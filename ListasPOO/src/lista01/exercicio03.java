package lista01;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] Args) {

        Scanner entrada = new Scanner(System.in);

        float comissao;

        System.out.println("Digite o CPF do vendedor: ");
         String cpf = entrada.nextLine();

         System.out.println("Digite o Código da peça: ");
          int codigo = entrada.nextInt();
          entrada.nextLine();

          System.out.println("Digite o preço unitário da peça: ");
          float preco = entrada.nextFloat();

          System.out.println("Digite a quantidade vendida: ");
           float quantidade = entrada.nextFloat();

         comissao = preco * quantidade * 0.05f;

       System.out.println("O valor da sua comissão será: " + comissao);

    }
}
