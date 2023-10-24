package lista04;

import java.util.Scanner;

public class exercicio01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite uma string: ");
            String input = scanner.nextLine();
            int numCaracteres = input.length();
            System.out.println("a) " + numCaracteres);
            System.out.println("b) " + input.toUpperCase());
            int numVogais = input.replaceAll("[^AEIOUaeiou]", "").length();
            System.out.println("c) " + numVogais);
            boolean comecaComUNI = input.toUpperCase().startsWith("UNI");
            System.out.println("d) " + comecaComUNI);
            boolean terminaComRIO = input.toUpperCase().endsWith("RIO");
            System.out.println("e) " + terminaComRIO);
            int numDigitos = input.replaceAll("[^0-9]", "").length();
            System.out.println("f) " + numDigitos);
            String str = input.toLowerCase().replaceAll("[^a-z0-9]", "");
            boolean ehPalindromo = str.equals(new StringBuilder(str).reverse().toString());
            System.out.println("g) " + ehPalindromo);
            scanner.close();
        }
    }
