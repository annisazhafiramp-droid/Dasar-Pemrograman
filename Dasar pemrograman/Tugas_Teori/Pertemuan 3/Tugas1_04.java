import java.util.Scanner;

public class Tugas1_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaLaptop, uangMuka, waktuMencicil;
        double bunga=0.02, cicilan, sisa, bungaCicilan;

        System.out.print("Masukkan Harga Laptop : Rp.");
        hargaLaptop=sc.nextInt();
        System.out.print("Masukkan Uang Muka : Rp.");
        uangMuka=sc.nextInt();
        System.out.print("Masukkan Lama Mencicil (dalam Bulan): ");
        waktuMencicil=sc.nextInt();
        System.out.println("Bunga Perbulan : 2% ");

        sisa = hargaLaptop - uangMuka;
        bungaCicilan = sisa * bunga;
        cicilan = (sisa + (bungaCicilan*waktuMencicil)) / waktuMencicil;

        System.out.println("Cicilan yang harus dibayar setiap bulan : Rp." + cicilan);

        sc.close();
    }
    
}
