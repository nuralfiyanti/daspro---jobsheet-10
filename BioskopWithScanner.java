import java.util.Scanner;

public class BioskopWithScanner {
    public static void main(String[] args) {
        
        // memasukkan inputan
        Scanner sc = new Scanner(System.in);

        // deklarasi variabel
        String nama, next;
        int baris, kolom;
        int menuOption;

        // membuat array penonton 4 baris dan 2 kolom
        String[][] penonton = new String[4][2];

        // Loop untuk menampilkan menu
        while (true) {
            System.out.println("=== Menu Bioskop ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih opsi (1-3): ");
            menuOption = sc.nextInt();
            sc.nextLine(); // membersihkan newline

            switch (menuOption) {
                case 1: // Input data penonton
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();
                        
                        // Loop untuk memasukkan baris dan kolom
                        while (true) {
                            System.out.print("Masukkan baris (1-4): ");
                            baris = sc.nextInt();
                            System.out.print("Masukkan kolom (1-2): ");
                            kolom = sc.nextInt();
                            sc.nextLine(); // membersihkan newline

                            // Validasi input baris dan kolom
                            if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                                System.out.println("Baris dan kolom harus dalam rentang yang valid (1-4 untuk baris, 1-2 untuk kolom).");
                                continue;
                            }

                            // Cek apakah kursi sudah terisi
                            if (penonton[baris - 1][kolom - 1] != null) {
                                System.out.println("Kursi sudah terisi! Silakan pilih kursi lain.");
                            } else {
                                // Menyimpan nama penonton
                                penonton[baris - 1][kolom - 1] = nama;
                                break; // keluar dari loop baris dan kolom
                            }
                        }

                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();

                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2: // Tampilkan daftar penonton
                    System.out.println("=== Daftar Penonton ===");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            // Ganti null dengan ***
                            String displayName = (penonton[i][j] != null) ? penonton[i][j] : "***";
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + displayName);
                        }
                    }
                    break;

                case 3: // Exit
                    System.out.println("Terima kasih! Program selesai.");
                    sc.close();
                    return;

                default:
                    System.out.println("Opsi tidak valid. Silakan pilih lagi.");
            }
        }
    }
}