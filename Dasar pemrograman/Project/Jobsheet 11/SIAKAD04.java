import java.util.Scanner;

public class SIAKAD04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pertanyaan 1: Jumlah mahasiswa dan mata kuliah ditentukan saat program berjalan
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah : ");
        int jumlahMataKuliah = sc.nextInt();

        int[][] nilai = new int[jumlahMahasiswa][jumlahMataKuliah];

        // Input nilai dan hitung rata-rata per mahasiswa
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + (totalPerSiswa / nilai[i].length));
        }

        System.out.println("\n====================================");
        System.out.println("Rata-rata nilai setiap mata kuliah : ");

        // Hitung rata-rata per mata kuliah
        for (int j = 0; j < nilai[0].length; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j + 1) + ": " + (totalPerMatkul / nilai.length));
        }

        sc.close();
    }
}
