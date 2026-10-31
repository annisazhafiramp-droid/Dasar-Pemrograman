
import java.util.Scanner;

public class Bioskop04 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
        int hargaTiket = 50000;
        int totalTiketTerjual = 0;
        double totalPenjualan = 0;
        String lanjut = "";

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            int jumlahTiket = sc.nextInt();

            // Validasi input
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Silakan masukkan ulang.");
                continue;
            }

            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15; // Diskon 15%
            } else if (jumlahTiket > 4) {
                diskon = 0.10; // Diskon 10%
            }

            double totalHargaSebelumDiskon = jumlahTiket * hargaTiket;
            double totalHargaBayar = totalHargaSebelumDiskon - (totalHargaSebelumDiskon * diskon);

            totalTiketTerjual += jumlahTiket;
            totalPenjualan += totalHargaBayar;

            System.out.println("Total bayar transaksi ini: Rp " + totalHargaBayar);

            sc.nextLine(); // Clear buffer
            System.out.print("Apakah ada transaksi lain? (y/n): ");
            lanjut = sc.nextLine();

        } while (lanjut.equalsIgnoreCase("ya"));

        System.out.println("\n--- REKAP PENJUALAN HARI INI ---");
        System.out.println("Total tiket terjual : " + totalTiketTerjual);
        System.out.println("Total hasil penjualan: Rp " + totalPenjualan);

        sc.close();
    }
}
    

