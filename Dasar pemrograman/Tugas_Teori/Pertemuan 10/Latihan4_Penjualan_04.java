import java.util.Scanner;

public class Latihan4_Penjualan_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahProduk;
        int jumlahHari;

        do {
            System.out.print("Masukkan jumlah produk: ");
            jumlahProduk = sc.nextInt();
        } while (jumlahProduk < 1);

        do {
            System.out.print("Masukkan jumlah hari: ");
            jumlahHari = sc.nextInt();
        } while (jumlahHari < 1);

        int totalSemua = 0;
        int p = 1;

        while (p <= jumlahProduk) {
            int totalProduk = 0;

            System.out.println("\nProduk ke-" + p);

            for (int h = 1; h <= jumlahHari; h++) {
                int jumlahTerjual;

                do {
                    System.out.print(
                        "Penjualan hari ke-" + h + ": "
                    );
                    jumlahTerjual = sc.nextInt();

                    if (jumlahTerjual < 0) {
                        System.out.println(
                            "Jumlah tidak boleh negatif!"
                        );
                    }
                } while (jumlahTerjual < 0);

                totalProduk += jumlahTerjual;
            }

            double rataRata = (double) totalProduk / jumlahHari;

            System.out.println("Total produk: " + totalProduk);
            System.out.println("Rata-rata harian: " + rataRata);

            totalSemua += totalProduk;
            p++;
        }

        System.out.println("\nTotal seluruh produk: " + totalSemua);

        sc.close();
    }
}
