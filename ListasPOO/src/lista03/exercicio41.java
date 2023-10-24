package lista03;

import java.util.Scanner;

public class exercicio41 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite a idade do nadador: ");
            int idade = scanner.nextInt();

            String categoria;

            if (idade >= 5 && idade <= 7) {
                categoria = "Infantil A";
            } else if (idade >= 8 && idade <= 11) {
                categoria = "Infantil B";
            } else if (idade >= 12 && idade <= 13) {
                categoria = "Juvenil A";
            } else if (idade >= 14 && idade <= 17) {
                categoria = "Juvenil B";
            } else {
                categoria = "Adultos";
            }

            System.out.println("O nadador pertence à categoria: " + categoria);

        }
    }


