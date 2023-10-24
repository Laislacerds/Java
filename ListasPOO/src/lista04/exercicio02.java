package lista04;

import java.util.Scanner;

public class exercicio02 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            String numeroPorExtenso = converterParaExtenso(numero);
            System.out.println("Resultado: " + numeroPorExtenso);

            scanner.close();
        }

        public static String converterParaExtenso(int numero) {
            String[] numerosPorExtenso = {"zero", "um", "dois", "três", "quatro", "cinco",
                    "seis", "sete", "oito", "nove"};

            String numeroPorExtenso = "";
            String numeroString = String.valueOf(numero);

            for (int i = 0; i < numeroString.length(); i++) {
                char digito = numeroString.charAt(i);
                int valor = Character.getNumericValue(digito);

                if (i > 0) {
                    numeroPorExtenso += ", ";
                }

                numeroPorExtenso += numerosPorExtenso[valor];
            }

            return numeroPorExtenso;
        }
    }


