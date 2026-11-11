
import java.util.Scanner;

public class ArrayRataNilaiModif04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         // 2. jumlah elemen ditentukan user
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jumlah = sc.nextInt();

        while (jumlah <= 0) {
            System.out.print("Jumlah Harus Lebih Dari 0, Masukkan Lagi: ");
            jumlah = sc.nextInt();
        }

        int[] nilaiMhs = new int[jumlah];
        int total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            total += nilaiMhs[i];
        }

        rata2 = (double) total / nilaiMhs.length;
        System.out.println("Total Nilai: " + total);
        System.out.println("Rata-Rata: " + rata2);

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
        }
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);

        String predikat;
        if (rata2 >= 85) {
            predikat = "SANGAT BAIK";
        } else if (rata2 >= 70) {
            predikat = "BAIK";
        } else {
            predikat = "PERLU PENDAMPINGAN";
        }
        System.out.println("Predikat Kelas: " + predikat);

        
        // 1. banyaknya mahasiswa yang lulus (> 70)
        int jumlahLulus = 0;
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
            }
        }
        System.out.println("Jumlah Mahasiswa Lulus: " + jumlahLulus);

        sc.close();
    }
    
}
