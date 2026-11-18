import java.util.Scanner;

public class BioskopWithScanner04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, menu;
        String nama, pilihan;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            menu = sc.nextInt();
            sc.nextLine(); // Membuang karakter newline

            if (menu == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        // Pertanyaan 3: Validasi nomor baris atau kolom tidak tersedia
                        if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                            System.out.println("Nomor baris atau kolom tidak tersedia! Silakan masukkan lagi.");
                        }
                        // Pertanyaan 4: Peringatan jika kursi sudah terisi penonton lain
                        else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi sudah terisi oleh " + penonton[baris - 1][kolom - 1] + "! Pilih kursi lain.");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            break;
                        }
                    }

                    System.out.print("Input penonton lainnya? (y/n): ");
                    pilihan = sc.nextLine();
                    if (pilihan.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (menu == 2) {
                System.out.println("\n=== DAFTAR PENONTON ===");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Baris " + (i + 1) + ": ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        // Pertanyaan 5: Ganti null dengan ***
                        String tampil = (penonton[i][j] == null) ? "***" : penonton[i][j];
                        System.out.print(tampil + (j < penonton[i].length - 1 ? ", " : ""));
                    }
                    System.out.println();
                }
            } else if (menu == 3) {
                System.out.println("Program selesai.");
                break;
            } else {
                System.out.println("Menu tidak valid!");
            }
        }
        sc.close();
    }
}
