import java.util.Scanner;

public class SIAKAD19 {
    public static void main(String[] args) {
        
        // Masukkan inputan
        Scanner sc = new Scanner(System.in);

        // Minta jumlah siswa dan mata kuliah
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();

        // Array of int bernama nilai dengan ukuran dinamis
        int[][] nilai = new int[jumlahSiswa][jumlahMatkul];

        // Scanner dan nested loop untuk mengisi elemen pada array nilai
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));

            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }

        // Menghitung dan menampilkan rata-rata nilai per siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            double totalPerSiswa = 0;

            for (int j = 0; j < jumlahMatkul; j++) {
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Rata-rata nilai mahasiswa ke-" + (i + 1) + ": " + totalPerSiswa / jumlahMatkul);
        }

        System.out.println("\n================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");

        // Menghitung dan menampilkan rata-rata nilai per mata kuliah
        for (int j = 0; j < jumlahMatkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jumlahSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata Kuliah " + (j + 1) + ": " + totalPerMatkul / jumlahSiswa);
        }

    }
}