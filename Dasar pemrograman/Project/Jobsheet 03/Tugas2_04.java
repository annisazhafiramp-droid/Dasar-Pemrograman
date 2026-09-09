import java.util.Scanner;

public class Tugas2_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahLembar, totalBiaya;
        int cetakPerLembar = 500;
        int biayaJilid = 5000;

          System.out.print("Masukkan jumlah lembar yang dicetak: ");
        jumlahLembar = sc.nextInt();

        totalBiaya = jumlahLembar * cetakPerLembar + biayaJilid; ;

        System.out.println("Total biaya cetak: Rp. " + totalBiaya);

        sc.close();
    }
}
