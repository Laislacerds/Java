package lista03;

public class exercicio43 {
        public static void main(String[] args) {
            int numeroQuadrados = 64;
            long totalGraos = 1;

            for (int i = 2; i <= numeroQuadrados; i++) {
                totalGraos *= 2;
            }
            System.out.println("Total de grãos esperados: " + totalGraos);
        }
    }

