public class Bioskop {
    public static void main(String[] args) {
        
        // Membuat array penonton
        String[][] penonton = new String[4][2];

        // Elemen array penonton
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        //Output array penonton
        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1] );
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1] );
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1] );
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1] );

        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(",", penonton[i]));
        }

        //Tambahan Kode
        System.out.println(penonton.length);

        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris: " + barisPenonton.length);
        }

        System.out.println("Penonton pada baris ke-3: ");

        for (String i : penonton[2]) {
            System.out.println(i);
        }
    }
}