package lista03;

import java.util.Scanner;

public class exercicio38 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char encerrar;

            do {
                System.out.print("Digite o código do operário: ");
                int codigo = scanner.nextInt();

                System.out.print("Digite o número de horas trabalhadas: ");
                int horasTrabalhadas = scanner.nextInt();

                double salarioTotal;
                double salarioExcedente = 0;

                if (horasTrabalhadas <= 50) {
                    salarioTotal = horasTrabalhadas * 10.0;
                } else {
                    salarioTotal = 50 * 10.0;
                    salarioExcedente = (horasTrabalhadas - 50) * 20.0;
                }

                System.out.println("Salário total: R$ " + salarioTotal);
                System.out.println("Salário excedente: R$ " + salarioExcedente);

                System.out.print("Deseja encerrar o programa (S/n)? ");
                encerrar = scanner.next().charAt(0);
            } while (encerrar != 'S' && encerrar != 's');


        }
    }


