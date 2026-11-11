import java.util.Scanner;

public class Tugas1_NilaiMHS_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. Memasukkan banyaknya nilai mahasiswa yang akan diinput
        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        int n = sc.nextInt();

        int[] nilai = new int[n];
        int total = 0;
        // 2. Memasukkan setiap nilai mahasiswa satu per satu
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }
        // 3. Menghitung nilai rata-rata
        double rata2 = (double) total / n;
        // 4. Menentukan nilai tertinggi dan terendah
        int tertinggi = nilai[0];
        int terendah = nilai[0];

        for (int i = 1; i < n; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }
        // 5. Menampilkan rekapitulasi data dan status kelulusan
        System.out.println("\n========================================");
        System.out.println("       REKAPITULASI NILAI MAHASISWA     ");
        System.out.println("========================================");
        System.out.println("Jumlah Mahasiswa : " + n);
        System.out.println("Total Nilai      : " + total);
        System.out.println("Rata-rata Nilai  : " + rata2);
        System.out.println("Nilai Tertinggi  : " + tertinggi);
        System.out.println("Nilai Terendah   : " + terendah);
        System.out.println("----------------------------------------");
        System.out.println("Daftar Nilai & Status Kelulusan:");

        for (int i = 0; i < n; i++) {
            String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }
        System.out.println("========================================");

        sc.close();
    }
}
    

