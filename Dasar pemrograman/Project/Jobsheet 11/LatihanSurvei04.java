import java.util.Scanner;

public class LatihanSurvei04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Konstanta ukuran survei (10 responden x 6 pertanyaan)
        final int JUMLAH_RESPONDEN = 10;
        final int JUMLAH_PERTANYAAN = 6;

        // a. Menyimpan hasil survei
        int[][] hasilSurvei = new int[JUMLAH_RESPONDEN][JUMLAH_PERTANYAAN];
        double totalKeseluruhan = 0;

        // a. Menginput dan menyimpan hasil survei (nilai 1-5)
        System.out.println("=== INPUT DATA SURVEI KEPUASAN PELANGGAN ===");
        for (int i = 0; i < hasilSurvei.length; i++) {
            System.out.println("\nResponden ke-" + (i + 1) + ":");
            for (int j = 0; j < hasilSurvei[i].length; j++) {
                while (true) {
                    System.out.print("  Nilai pertanyaan ke-" + (j + 1) + " (1-5): ");
                    int nilai = sc.nextInt();
                    if (nilai >= 1 && nilai <= 5) {
                        hasilSurvei[i][j] = nilai;
                        totalKeseluruhan += nilai;
                        break;
                    } else {
                        System.out.println("  [!] Input tidak valid. Masukkan angka antara 1 sampai 5.");
                    }
                }
            }
        }

        // b. Menampilkan nilai rata-rata untuk setiap responden
        System.out.println("\n==========================================");
        System.out.println("RATA-RATA NILAI SETIAP RESPONDEN:");
        for (int i = 0; i < hasilSurvei.length; i++) {
            double totalPerResponden = 0;
            for (int j = 0; j < hasilSurvei[i].length; j++) {
                totalPerResponden += hasilSurvei[i][j];
            }
            double rataResponden = totalPerResponden / hasilSurvei[i].length;
            System.out.printf("Responden ke-%-2d : %.2f\n", (i + 1), rataResponden);
        }

        // c. Menampilkan nilai rata-rata untuk setiap pertanyaan 
        System.out.println("\n==========================================");
        System.out.println("RATA-RATA NILAI SETIAP PERTANYAAN:");
        for (int j = 0; j < hasilSurvei[0].length; j++) {
            double totalPerPertanyaan = 0;
            for (int i = 0; i < hasilSurvei.length; i++) {
                totalPerPertanyaan += hasilSurvei[i][j];
            }
            double rataPertanyaan = totalPerPertanyaan / hasilSurvei.length;
            System.out.printf("Pertanyaan ke-%d : %.2f\n", (j + 1), rataPertanyaan);
        }

        // d. Menampilkan nilai rata-rata secara keseluruhan
        int totalSeluruhData = JUMLAH_RESPONDEN * JUMLAH_PERTANYAAN;
        double rataKeseluruhan = totalKeseluruhan / totalSeluruhData;
        System.out.println("\n==========================================");
        System.out.printf("RATA-RATA KESELURUHAN: %.2f\n", rataKeseluruhan);

        sc.close();
    }
}