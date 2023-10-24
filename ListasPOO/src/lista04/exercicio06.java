package lista04;

import java.util.Random;

public class exercicio06 {
        public static void main(String[] args) {

            String S1 = "01010101";
            String S2 = "10101010";

            String[] filhos = recombinacao(S1, S2);

            mutacao(filhos[0]);

            System.out.println("Indivíduo 1 (pai): " + S1);
            System.out.println("Indivíduo 2 (pai): " + S2);
            System.out.println("Indivíduo 3 (filho 1): " + filhos[0]);
            System.out.println("Indivíduo 4 (filho 2): " + filhos[1]);
        }

        public static String[] recombinacao(String S1, String S2) {
            int tamanho = S1.length();
            Random random = new Random();
            int pontoCorte = random.nextInt(tamanho);

            String filho1 = S1.substring(0, pontoCorte) + S2.substring(pontoCorte);
            String filho2 = S2.substring(0, pontoCorte) + S1.substring(pontoCorte);

            return new String[]{filho1, filho2};
        }

        public static void mutacao(String S1) {
            Random random = new Random();
            int posicaoMutacao = random.nextInt(S1.length());
            char novoCaracter = S1.charAt(posicaoMutacao) == '0' ? '1' : '0';
            S1 = S1.substring(0, posicaoMutacao) + novoCaracter + S1.substring(posicaoMutacao + 1);
        }
    }


