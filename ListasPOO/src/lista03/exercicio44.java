package lista03;

import java.util.Scanner;

public class exercicio44 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char encerrar;

            do {
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Conversão de Graus Celsius em Graus Fahrenheit");
                System.out.println("2 - Conversão de Graus Fahrenheit em Graus Celsius");
                System.out.println("3 - Peso ideal do homem");
                System.out.println("4 - Peso ideal da mulher");

                int escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.print("Digite a temperatura em Graus Celsius: ");
                        double celsius = scanner.nextDouble();
                        double fahrenheit = (celsius * 9/5) + 32;
                        System.out.println("Temperatura em Graus Fahrenheit: " + fahrenheit);
                        break;
                    case 2:
                        System.out.print("Digite a temperatura em Graus Fahrenheit: ");
                        fahrenheit = scanner.nextDouble();
                        celsius = (fahrenheit - 32) * 5/9;
                        System.out.println("Temperatura em Graus Celsius: " + celsius);
                        break;
                    case 3:
                        System.out.print("Digite a altura (em metros): ");
                        double alturaHomem = scanner.nextDouble();
                        double pesoIdealHomem = (72.7 * alturaHomem) - 58;

                        System.out.print("Digite o peso atual (em quilogramas): ");
                        double pesoAtualHomem = scanner.nextDouble();

                        if (pesoAtualHomem < pesoIdealHomem) {
                            System.out.println("Abaixo do peso ideal para o homem.");
                        } else if (pesoAtualHomem > pesoIdealHomem) {
                            System.out.println("Acima do peso ideal para o homem.");
                        } else {
                            System.out.println("Peso ideal para o homem.");
                        }
                        break;
                    case 4:
                        System.out.print("Digite a altura (em metros): ");
                        double alturaMulher = scanner.nextDouble();
                        double pesoIdealMulher = (62.1 * alturaMulher) - 44.7;

                        System.out.print("Digite o peso atual (em quilogramas): ");
                        double pesoAtualMulher = scanner.nextDouble();

                        if (pesoAtualMulher < pesoIdealMulher) {
                            System.out.println("Abaixo do peso ideal para a mulher.");
                        } else if (pesoAtualMulher > pesoIdealMulher) {
                            System.out.println("Acima do peso ideal para a mulher.");
                        } else {
                            System.out.println("Peso ideal para a mulher.");
                        }
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }

                System.out.print("Deseja encerrar o programa (S/n)? ");
                encerrar = scanner.next().charAt(0);
            } while (encerrar != 'S' && encerrar != 's');

        }
    }


