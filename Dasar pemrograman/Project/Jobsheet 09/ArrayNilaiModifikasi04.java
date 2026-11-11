
import java.util.Scanner;

public class ArrayNilaiModifikasi04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }

        // 3. Memakai foreach, nomor mahasiswa dihitung manual
        System.out.println("\n--- Semua Mahasiswa ---");
        int no = 1;
        for (int nilai : nilaiAkhir) {
            String status = (nilai > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + no + ": " + nilai + " (" + status + ")");
            no++;
        }

        // 2. hanya tampilkan yang lulus
        System.out.println("\n--- Mahasiswa Yang lulus ---");
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (LULUS)");
            }
        }

        // 4. hitung jumlah lulus dan tidak lulus
        int lulus = 0;
        int tidakLulus = 0;
        for (int nilai : nilaiAkhir) {
            if (nilai > 70) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        System.out.println("\nJumlah Mahasiswa Lulus       : " + lulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus : " + tidakLulus);

        sc.close();
    }
 }
    

