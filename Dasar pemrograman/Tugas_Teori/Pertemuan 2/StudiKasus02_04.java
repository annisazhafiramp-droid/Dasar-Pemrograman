import java.util.Scanner;

public class StudiKasus02_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Tabungan Awal: ");
        double tabunganAwal = input.nextDouble();

        System.out.print("Masukkan Lama Menabung (Tahun): ");
        int lamaMenabung = input.nextInt();

        System.out.print("Masukkan Bunga Dalam %: ");
        double persentaseBunga = input.nextDouble(); // 2% per tahun
        persentaseBunga = persentaseBunga / 100;

        // Rumus Bunga Majemuk: A = P * (1 + r)^t
        double tabunganAkhir = tabunganAwal * Math.pow(1 + persentaseBunga, lamaMenabung);
        double totalBunga = tabunganAkhir - tabunganAwal;

        System.out.println("------------------------------------");
        System.out.printf("Total Bunga Didapat : Rp%.0f\n", totalBunga);
        System.out.printf("Total Tabungan Akhir: Rp%.0f\n", tabunganAkhir);

        input.close();
    }
}  


