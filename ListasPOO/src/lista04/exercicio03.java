package lista04;

import java.util.Scanner;

public class exercicio03 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um nome: ");
            String nome = scanner.nextLine();

            String iniciais = obterIniciais(nome);
            System.out.println("Iniciais: " + iniciais);

            scanner.close();
        }

        public static String obterIniciais(String nome) {
            String[] palavras = nome.split(" ");
            StringBuilder iniciais = new StringBuilder();

            for (String palavra : palavras) {
                if (!ehConector(palavra)) {
                    iniciais.append(palavra.charAt(0));
                }
            }

            return iniciais.toString().toUpperCase();
        }

        public static boolean ehConector(String palavra) {
            String[] conectores = {"e", "do", "da", "dos", "das", "de", "di", "du"};
            for (String conector : conectores) {
                if (palavra.equalsIgnoreCase(conector)) {
                    return true;
                }
            }
            return false;
        }
    }

