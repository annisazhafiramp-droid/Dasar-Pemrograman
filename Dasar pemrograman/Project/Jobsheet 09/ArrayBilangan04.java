import java.util.Arrays;

public class ArrayBilangan04 {
    public static void main(String[] args) {

        // Deklarasi dan inisialisasi array
        int[] bil = new int[4];

        // Pengisian elemen array satu per satu
        bil[0] = 5;
        bil[1] = 13;
        bil[2] = -7;
        bil[3] = 17;

        // 1. Menampilkan isi array menggunakan perulangan for
        System.out.println("--- Menggunakan For Loop ---");
        for (int i = 0; i < bil.length; i++) {
            System.out.println("bil[" + i + "] = " + bil[i]);
        }

        // 2. Menampilkan isi array menggunakan for each loop
        System.out.println("\n--- Menggunakan Foreach Loop ---");
        for (int nilai : bil) {
            System.out.println(nilai);
        }

        // 3. Menampilkan array menggunakan Arrays.toString()
        System.out.println("\n--- Menggunakan Arrays.toString() ---");
        System.out.println(Arrays.toString(bil));
    }
    
}
