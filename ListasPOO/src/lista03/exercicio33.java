package lista03;

import java.util.Scanner;

public class exercicio33 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double somaNotas = 0;
            int contadorAlunos = 0;

            while (true) {
                System.out.print("Digite o número de matrícula do aluno (ou digite fim para encerrar): ");
                String numeroMatricula = scanner.next();

                if (numeroMatricula.equalsIgnoreCase("fim")) {
                    break;
                }

                double nota = scanner.nextDouble();

                somaNotas += nota;
                contadorAlunos++;
            }

            if (contadorAlunos > 0) {
                double media = somaNotas / contadorAlunos;
                System.out.printf("A média das notas dos %d alunos é: %.2f%n", contadorAlunos, media);
            } else {
                System.out.println("Nenhum aluno foi inserido.");
            }

            scanner.close();
        }
    }


