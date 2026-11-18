public class Bioskop_04 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];

        // Langkah 3 & Pertanyaan 3: Melengkapi seluruh elemen
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        // Langkah 4: Menampilkan seluruh elemen
        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);

        // Pertanyaan 6: Panjang setiap baris dengan for loop
        System.out.println("\nTotal baris: " + penonton.length);
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ": " + penonton[i].length);
        }

        // Pertanyaan 7: Panjang setiap baris dengan foreach loop
        System.out.print("\nTotal baris (foreach): ");
        System.out.println(penonton.length);
        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris: " + barisPenonton.length);
        }

        // Pertanyaan 9: Penonton pada baris ke-3 dengan foreach loop
        System.out.println("\nPenonton pada baris ke-3:");
        for (String nama : penonton[2]) {
            System.out.println(nama);
        }

        // Pertanyaan 10: Penonton setiap baris dengan String.join()
        System.out.println("\nDaftar penonton per baris:");
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton pada baris ke-" + (i + 1) + ": " + String.join(", ", penonton[i]));
        }
    }
}
        
    