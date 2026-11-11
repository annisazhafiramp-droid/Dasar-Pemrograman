import java.util.Scanner;

public class Tugas2_KafeKampus_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi dan inisialisasi array menu utama & harga
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        // Menampilkan daftar menu
        System.out.println("========================================");
        System.out.println("          DAFTAR MENU KAFE KAMPUS       ");
        System.out.println("========================================");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }
        System.out.println("========================================\n");

        // Fitur Pencarian Menu
        System.out.print("Cari Menu (Masukkan Nama Menu): ");
        String cari = sc.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            
            if (menu[i].equalsIgnoreCase(cari)) {
                System.out.println("--> Hasil Pencarian: '" + menu[i] + "' TERSEDIA dengan harga Rp " + harga[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("--> Hasil Pencarian: Maaf, Menu '" + cari + "' TIDAK TERSEDIA.");
        }

        // Fitur Pemesanan
        System.out.println("\n----------------------------------------");
        System.out.print("Masukkan Jumlah Item Pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine(); 

        String[] pesananNama = new String[jumlahPesanan];
        int[] pesananHarga = new int[jumlahPesanan];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            boolean valid = false;
            while (!valid) {
                System.out.print("Masukkan Nama Menu Pesanan ke-" + (i + 1) + ": ");
                String itemInput = sc.nextLine();

                // Validasi pesanan \
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(itemInput)) {
                        pesananNama[i] = menu[j];
                        pesananHarga[i] = harga[j];
                        totalBiaya += harga[j];
                        valid = true;
                        break;
                    }
                }

                if (!valid) {
                    System.out.println("Error: Menu Tidak Ditemukan Di Daftar Kafe! Silakan Ketik Ulang.");
                }
            }
        }

        // Menampilkan Struk / Rincian Nota Pemesanan
        System.out.println("\n========================================");
        System.out.println("             NOTA PEMESANAN             ");
        System.out.println("========================================");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + pesananNama[i] + " \t: Rp " + pesananHarga[i]);
        }
        System.out.println("----------------------------------------");
        System.out.println("TOTAL BIAYA          : Rp " + totalBiaya);
        System.out.println("========================================");
    }
}
    

