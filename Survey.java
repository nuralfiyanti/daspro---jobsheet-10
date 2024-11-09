import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] responses = new int[10][6]; // 10 responden, 6 pertanyaan
        double[] averagePerRespondent = new double[10];
        double[] averagePerQuestion = new double[6];
        double overallAverage = 0;

        // a. Menyimpan hasil survey
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                System.out.print("Pertanyaan " + (j + 1) + " (1-5): ");
                responses[i][j] = scanner.nextInt();
            }
        }

        // b. Menampilkan nilai rata-rata untuk setiap responden
        System.out.println("\nRata-rata untuk setiap responden:");
        for (int i = 0; i < 10; i++) {
            double sum = 0;
            for (int j = 0; j < 6; j++) {
                sum += responses[i][j];
            }
            averagePerRespondent[i] = sum / 6;
            System.out.println("Responden " + (i + 1) + ": " + averagePerRespondent[i]);
            overallAverage += averagePerRespondent[i];
        }

        // c. Menampilkan nilai rata-rata untuk setiap pertanyaan
        System.out.println("\nRata-rata untuk setiap pertanyaan:");
        for (int j = 0; j < 6; j++) {
            double sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += responses[i][j];
            }
            averagePerQuestion[j] = sum / 10;
            System.out.println("Pertanyaan " + (j + 1) + ": " + averagePerQuestion[j]);
        }

        // d. Menampilkan nilai rata-rata secara keseluruhan
        overallAverage /= 10; // Rata-rata keseluruhan
        System.out.println("\nRata-rata keseluruhan: " + overallAverage);

    }
}