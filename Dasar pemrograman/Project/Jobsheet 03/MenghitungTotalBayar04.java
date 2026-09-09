import java.util.Scanner;

public class MenghitungTotalBayar04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga;
        double potongan, jml_bayar, diskon=0.15;
        System.out.print("Masukkan Harga Barang : Rp.");
        harga=sc.nextInt();

        potongan=diskon*harga;
        jml_bayar=harga-potongan;

        System.out.println("Jumlah yang harus anda bayar : Rp." +jml_bayar);

        sc.close();
     }
}
