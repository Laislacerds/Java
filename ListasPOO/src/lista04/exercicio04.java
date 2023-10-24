package lista04;

import java.util.Scanner;

public class exercicio04 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um texto: ");
            String texto = scanner.nextLine();

            int numCaracteres = contarCaracteres(texto);
            int numPalavras = contarPalavras(texto);

            System.out.println("Número total de caracteres: " + numCaracteres);
            System.out.println("Número de palavras: " + numPalavras);

            scanner.close();
        }

        public static int contarCaracteres(String texto) {
            return texto.length();
        }

        public static int contarPalavras(String texto) {
            String[] palavras = texto.split("\\s+");
            return palavras.length;
        }
    }


