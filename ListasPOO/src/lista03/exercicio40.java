package lista03;

import java.util.Scanner;

public class exercicio40 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char encerrar;

            do {
                System.out.print("Digite o índice de poluição medido: ");
                double indicePoluicao = scanner.nextDouble();

                if (indicePoluicao >= 0.05 && indicePoluicao <= 0.25) {
                    System.out.println("Índice de poluição aceitável.");
                } else if (indicePoluicao <= 0.3) {
                    System.out.println("Indústrias do 1 grupo intimadas a suspenderem suas atividades.");
                } else if (indicePoluicao <= 0.4) {
                    System.out.println("Indústrias do 1 e 2 grupo intimadas a suspenderem suas atividades.");
                } else if (indicePoluicao <= 0.5) {
                    System.out.println("Todos os grupos devem ser notificados a paralisarem suas atividades.");
                } else {
                    System.out.println("Índice de poluição fora da faixa de controle.");
                }

                System.out.print("Deseja encerrar o programa (S/n)? ");
                encerrar = scanner.next().charAt(0);
            } while (encerrar != 'S' && encerrar != 's');

        }
    }


