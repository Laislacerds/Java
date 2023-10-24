package lista04;

import java.util.Scanner;

public class exercicio05 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um texto: ");
            String texto = scanner.nextLine();

            String textoFormatado = formatarTexto(texto);
            System.out.println("Texto formatado: " + textoFormatado);

            scanner.close();
        }

        public static String formatarTexto(String texto) {
            return texto.replaceAll("\\s+", " ");
        }
    }


