import java.util.Scanner;

public class seleksiAsisten04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        boolean mahasiswaAktif = sc.nextBoolean();

        System.out.print("Apakah sedang mendapatkan sanksi akademik? (true/false): ");
        boolean sedangDisanksi = sc.nextBoolean();

        // Level 1: Cek status keaktifan dan sanksi akademik
        if (mahasiswaAktif && !sedangDisanksi) {

            System.out.print("Masukkan nilai Dasar Pemrograman: ");
            int nilaiDaspro = sc.nextInt();

            System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
            boolean punyaSertifikat = sc.nextBoolean();

            // Level 2: Cek nilai Daspro atau sertifikat kompetensi
            if (nilaiDaspro >= 80 || punyaSertifikat) {

                System.out.println("\nSelamat! Anda lolos ke tahap wawancara.");
                System.out.print("\nMasukkan nilai wawancara: ");
                int nilaiWawancara = sc.nextInt();

                // Level 3: Cek nilai wawancara
                if (nilaiWawancara >= 75) {
                    System.out.println("\nSelamat! Anda DITERIMA sebagai Asisten Praktikum.");
                } else {
                    System.out.println("\nGagal: Nilai wawancara kurang dari 75 (Nilai Anda: " + nilaiWawancara + ").");
                }

            } else {
                System.out.println("\nGagal: Nilai Dasar Pemrograman kurang dari 80 dan tidak memiliki sertifikat kompetensi.");
            }

        } else {
            System.out.println("\nGagal: Mahasiswa tidak aktif atau sedang mendapatkan sanksi akademik.");
        }

        sc.close();
    }
}
    