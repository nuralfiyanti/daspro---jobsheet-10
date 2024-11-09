import java.util.Arrays;

public class Numbers19 {
    public static void main(String[] args) {

        // Deklarasi array dengan 3 baris
        int[][] myNumbers = new int[3][]; 

        // Instansiasi jumlah kolom setiap baris
        myNumbers[0] = new int[5]; // Baris pertama dengan 5 kolom
        myNumbers[1] = new int[3]; // Baris kedua dengan 3 kolom
        myNumbers[2] = new int[1]; // Baris ketiga dengan 1 kolom

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

            for (int i = 0; i < myNumbers.length; i++) {
                System.out.println("Panjang baris ke-" + (i+1) + ": " + myNumbers[i].length);
            }
    }
}
